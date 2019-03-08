
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.Customer],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Customer",user)/*5.27*/{_display_(Seq[Any](format.raw/*5.28*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new Customer</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*11.6*/form(action=routes.HomeController.addCustomerSubmit(), 'class -> "form-horizontal", 'role -> "form")/*11.106*/ {_display_(Seq[Any](format.raw/*11.108*/("""
        """),format.raw/*12.37*/("""
        """),format.raw/*13.99*/("""
        """),_display_(/*14.10*/CSRF/*14.14*/.formField),format.raw/*14.24*/("""

        """),format.raw/*16.9*/("""<!-- Use helper methods to add fields to the form -->
        <!-- Note that the form fields are related to the fields of the itemForm object -->
        <!-- Note the arguments that are being passed to the scala function inputText (they are 
             essentially instructions for constructing an HTML input element)-->
        <!-- Note the """),_display_(/*20.24*/select),format.raw/*20.30*/(""" """),format.raw/*20.31*/("""function's argument options. This needs to be a map of ids-to-names
             and this is provided by the method Category.options(), which we added to the Category
             class in the previous step. -->
            """),_display_(/*23.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*23.88*/("""
            """),_display_(/*24.14*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "", 'hidden -> "hidden")),format.raw/*24.106*/("""
            """),_display_(/*25.14*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.86*/("""
            """),_display_(/*26.14*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*26.94*/("""
            """),_display_(/*27.14*/inputDate(userForm("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*27.122*/("""
            """),_display_(/*28.14*/inputText(userForm("street1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*28.93*/("""
            """),_display_(/*29.14*/inputText(userForm("street2"), '_label -> "Street 2", 'class -> "form-control")),format.raw/*29.93*/("""
            """),_display_(/*30.14*/inputText(userForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*30.86*/("""
            """),_display_(/*31.14*/inputText(userForm("postCode"), '_label -> "Post Code", 'class -> "form-control")),format.raw/*31.95*/("""
            """),_display_(/*32.14*/inputText(userForm("creditCard"), '_label -> "Credit Card Number", 'class -> "form-control")),format.raw/*32.106*/("""


            """),_display_(/*35.14*/inputText(userForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*35.78*/("""
            
            """),format.raw/*37.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update Customer" class="btn btn-primary">
                <a href=""""),_display_(/*43.27*/routes/*43.33*/.HomeController.usersCustomer()),format.raw/*43.64*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*47.6*/(""" """),format.raw/*47.24*/("""
""")))}),format.raw/*48.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 08 09:57:56 GMT 2019
                  SOURCE: /home/wdd/ca/SDEV4lab/lab7/app/views/addCustomer.scala.html
                  HASH: db91d62ad52c129cfbc6e4f91f664c5c3612db46
                  MATRIX: 993->1|1129->67|1173->65|1200->83|1227->85|1260->110|1298->111|1329->116|1652->413|1762->513|1803->515|1840->552|1877->651|1914->661|1927->665|1958->675|1995->685|2369->1032|2396->1038|2425->1039|2677->1264|2772->1338|2813->1352|2927->1444|2968->1458|3061->1530|3102->1544|3203->1624|3244->1638|3374->1746|3415->1760|3515->1839|3556->1853|3656->1932|3697->1946|3790->2018|3831->2032|3933->2113|3974->2127|4088->2219|4131->2235|4216->2299|4270->2325|4666->2694|4681->2700|4733->2731|4893->2861|4922->2879|4954->2881
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|47->16|51->20|51->20|51->20|54->23|54->23|55->24|55->24|56->25|56->25|57->26|57->26|58->27|58->27|59->28|59->28|60->29|60->29|61->30|61->30|62->31|62->31|63->32|63->32|66->35|66->35|68->37|74->43|74->43|74->43|78->47|78->47|79->48
                  -- GENERATED --
              */
          