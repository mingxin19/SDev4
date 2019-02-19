package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.inject.Inject;

import models.users.*;

import views.html.*;

public class LoginController extends Controller{
    private FormFactory formFactory;

    @Inject
    public LoginController(FormFactory f){
        this.formFactory = f;
    }

    public Result login(){
        Form<Login> loginForm = formFactory.form(Login.class);
        return ok(login.render(loginForm));
    }


    
}
