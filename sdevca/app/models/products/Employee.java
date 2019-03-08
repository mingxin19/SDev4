package models.products;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employee extends Model {

    // Properties
    @Id
    private Long id;
    @Constraints.Required
    private String name;


    @ManyToMany(cascade = CascadeType.ALL)
    private List<Project> project;


    // Default Constructor
    public Employee() {
    }

    // Constructor to initialise object
    public Employee(Long id, String name, List<Project> project) {
        this.id = id;
        this.name = name;
        this.project = project;
        
    }

    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);
			    
    public static final List<Employee> findAll() {
        return Employee.find.query().where().orderBy("name asc").findList();
    }

    // Accessor methods
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return project;
    }

    public void setProjects(List<Project> projects) {
        this.project = projects;
    }

    public static boolean inCategory(Long category, Long project) {
        return find.query().where()
            .eq("projects.id", project)
            .eq("id", category)
            .findCount() > 0;
    }
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap();
     
        // Get all the categories from the database and add them to the options hash map
        for (Employee e: Employee.find().query().orderBy("name").findList()) {
           options.put(e.getId().toString(), c.getName());
        }
        return options;
     }
    

    
}