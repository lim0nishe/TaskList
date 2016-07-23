package controllers;

import play.*;
import play.mvc.*;
import play.data.validation.*;
import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {

        // load existing tasks from database
        List<Task> tasks = Task.findAll();

        render(tasks);
    }

    public static void addTask(@Required String name, @Required String description,
                               String startDate, String endDate){
        if (!validation.hasErrors()){
            Task newTask = new Task(name, description, startDate, endDate).save();
        }

        List<Task> tasks = Task.findAll();
        render("Application/index.html", tasks);
    }
}