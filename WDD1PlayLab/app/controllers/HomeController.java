package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }

    public Result onsale(Long cat) {
        List<ItemOnSale> itemList = null;
        List<Category> categoryList = Category.findAll();

        if(cat == 0){
            itemList =  ItemOnSale.findAll();  
        }else{
            itemList = Category.find.ref(cat).getItems();
        }

        return ok(onsale.render(itemList, categoryList));
    }     

    public Result about() {
        return ok(about.render());
    }

    public Result info() {
        return ok(info.render());
    }

    public Result contact() {
        return ok(contact.render());
    }

}
