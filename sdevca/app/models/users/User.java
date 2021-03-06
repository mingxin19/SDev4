package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import org.mindrot.jbcrypt.BCrypt;
import play.data.validation.*;



@Entity
// specify mapped table name
@Table(name = "user")
// map subclasses to a single table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//the discriminator column is used to define User type
@DiscriminatorColumn(name="type")
@DiscriminatorValue("u")

public class User extends Model {
    @Id
    private String email;

    private String role;
    private String fName;

    private String lName;

    private String password;

    public static final Finder<Long, User> find = new Finder<>(User.class);

    public static final List<User> findAll() {
        return User.find.all();
    }

    public static User authenticate(String email, String password) {
        //User user = User.find.query().where().eq("email", email).findUnique();
        //if (user != null && BCrypt.checkpw(password, user.getPassword())) {
            //return user;
        //} else {
            //return user;
        //}
        return find.query().where().eq("email", email).eq("password", password).findUnique();
    }

    public static User getUserById(String id) {
        if (id == null) {
            return null;
        } else {
            return find.query().where().eq("email", id).findUnique();
        }
    }




    public User() {

    }

    public User(String email, String fName, String lName, Dting role,String password) {
        this.email = email;
        this.fName = fName;
        this.lName = lName;
        this.role = role;
        this.password = password;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public static Finder<Long, User> getFind() {
        return find;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}