package models.projects;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;



// Project entity managed by Ebean
@Entity
public class Project extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String department;

    // many to many mapping
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "project")
    private List<Employee> employee = new ArrayList<Employee>();

    public  Project() {
    }

    
    public  Project(Long id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }
	
	

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
   public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    //Generic query helper for entity Computer with id Long
    public static Finder<Long,Project> find = new Finder<Long,Project>(Project.class);

    // Find all Projects in the database
    // Filter Employee name 
    public static List<Project> findAll(String filter) {
        return Project.find.query().where()
                        // name like filter value (surrounded by wildcards)
                        .ilike("name", "%" + filter + "%")
                        .orderBy("name asc")
                        .findList();
    }

    // Find all Projects for a category
    // Filter project name 
    public static List<Project> findFilter(Long catID, String filter) {
        return Project.find.query().where()
                        // Only include products from the matching cat ID
                        // In this case search the ManyToMany relation
                        .eq("employee.id", catID)
                        // name like filter value (surrounded by wildcards)
                        .ilike("name", "%" + filter + "%")
                        .orderBy("name asc")
                        .findList();
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap();
 
        // Get all the Project from the database and add them to the options hash map
        for (Project p: Project.findAll()) {
        options.put(p.getId().toString(), c.getName());
        }   
        return options;
    }


    
    
}

