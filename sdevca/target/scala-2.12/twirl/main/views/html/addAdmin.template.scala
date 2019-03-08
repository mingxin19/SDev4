
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

object addAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Administrator],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.Administrator],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Admin",user)/*5.24*/{_display_(Seq[Any](format.raw/*5.25*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new administrator</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*11.6*/form(action=routes.HomeController.addAdminSubmit(), 'class -> "form-horizontal", 'role -> "form")/*11.103*/ {_display_(Seq[Any](format.raw/*11.105*/("""
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
            """),_display_(/*24.14*/inputText(userForm("role").copy(value=Some("admin")), '_label -> "", 'hidden -> "hidden")),format.raw/*24.103*/("""
            """),_display_(/*25.14*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.86*/("""
            """),_display_(/*26.14*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*26.94*/("""

            """),_display_(/*28.14*/inputText(userForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*28.78*/("""
            
            """),format.raw/*30.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update Admin" class="btn btn-primary">
                <a href=""""),_display_(/*36.27*/routes/*36.33*/.HomeController.usersAdmin()),format.raw/*36.61*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*40.6*/(""" """),format.raw/*40.24*/("""
""")))}),format.raw/*41.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Administrator],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.Administrator],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 08 09:57:57 GMT 2019
                  SOURCE: /home/wdd/ca/SDEV4lab/lab7/app/views/addAdmin.scala.html
                  HASH: d2e0228c5e50d9cd190a12eb83562e8da193e55f
                  MATRIX: 995->1|1136->72|1180->70|1207->88|1234->90|1264->112|1302->113|1333->118|1661->420|1768->517|1809->519|1846->556|1883->655|1920->665|1933->669|1964->679|2001->689|2375->1036|2402->1042|2431->1043|2683->1268|2778->1342|2819->1356|2930->1445|2971->1459|3064->1531|3105->1545|3206->1625|3248->1640|3333->1704|3387->1730|3780->2096|3795->2102|3844->2130|4004->2260|4033->2278|4065->2280
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|47->16|51->20|51->20|51->20|54->23|54->23|55->24|55->24|56->25|56->25|57->26|57->26|59->28|59->28|61->30|67->36|67->36|67->36|71->40|71->40|72->41
                  -- GENERATED --
              */
          