package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name ="user")
@DiscriminatorValue("e")
public class Employee extends User{
    
    public Employee(){

    }

    public Employee(String email, String fname, String lName, String role, String password){
        super(email, fName, lName, "employee", password);
    }

    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);

    public static final List<Employee> findAll(){
        return Employee.find.all();
    }

}