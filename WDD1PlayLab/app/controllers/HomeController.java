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
    private FormFactory formFactory;
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    @Inject
    public HomeController(FormFactory f){
        this.formFactory = f;
    }

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
    
    public Result addItem() {
        Form<ItemOnSale> itemForm = formFactory.form(ItemOnSale.class);
        return ok(addItem.render(itemForm));
    }

    public Result addItemSubmit(){
        Form<ItemOnSale> newItemForm = formFactory.form(ItemOnSale.class).bindFromRequest();

        if(newItemForm.hasErrors()){
            return badRequest(addItem.render(newItemForm));
        }else{
            ItemOnSale newItem = newItemForm.get();
            newItem.save();
            flash("success", "Item "+newItem.getName() + " was added.");
            return redirect(controllers.routes.HomeController.onsale(0));
        }
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
