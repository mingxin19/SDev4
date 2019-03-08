package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name ="user")
@DiscriminatorValue("a")
public class Administrator extends User{
    public Administrator(){

    }

    public Administrator(String email, String fname, String lName, String role, String password){
        super(email, fName, lName, role, password);
    }

    public static final Finder<Long, Administrator> find = new Finder<>(Administrator.class);

    public static final List<Administrator> findAll(){
        return Administrator.find.all();
    }
}
