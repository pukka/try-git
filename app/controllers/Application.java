package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("start!!Your new application is ready."));
    }

    public static Result tasks() {
    	return TODO;
    }

    public static Result newTask() {
    	return TODO;
    }

}
