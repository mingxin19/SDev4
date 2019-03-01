package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

// Import models
import models.users.*;
import models.projects.*;


public class ProjectCtrl extends Controller {

    /** Dependency Injection **/

    /** http://stackoverflow.com/questions/15600186/play-framework-dependency-injection **/
    private FormFactory formFactory;

    /** http://stackoverflow.com/a/37024198 **/
    private play.api.Environment env;

    /** http://stackoverflow.com/a/10159220/6322856 **/
    @Inject
    public ProjectCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    // Get a user - if logged in email will be set in the session
    @Transactional
	public User getCurrentUser() {
		User u = User.getLoggedIn(session().get("email"));
		return u;
	}

    public Result index() {
		return redirect(routes.ProjectCtrl.listProjects(0, ""));
    }

	// Get a list of projects
    // If cat parameter is 0 then return all projects
    // Otherwise return projects for a category (by id)
    // In both cases projects will be searched using the fiter value
    @Transactional
    public Result listProjects(Long cat, String filter) {
        // Get list of all categories in ascending order
        List<Category> categories = Category.findAll();
        // Instantiate projects, an Array list of projects			
        List<Project> projects = new ArrayList<Project>();
    
        if (cat == 0) {
            // Get the list of ALL projects with filter
            projects = Project.findAll(filter);
        }
        else {
            // Get projects for the selected category and filter (search field)
            projects = Project.findFilter(cat, filter);
        }
        // Render the list projects view, passing parameters
        // categories and projects lists
        // category id - used for filtering
        // the filter string - this will be displayed in the filter text input
        // current user - if one is logged in
       return ok(listProjects.render(env, categories, projects, cat, filter, getCurrentUser()));
  
}
}