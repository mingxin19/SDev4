
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

object registerUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.UserPassword2],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.UserPassword2],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Register User",user)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new user</p>

    """),format.raw/*8.57*/("""
	"""),_display_(/*9.3*/if(flash.containsKey("error"))/*9.33*/ {_display_(Seq[Any](format.raw/*9.35*/("""
		"""),format.raw/*10.3*/("""<div class="alert alert-success">
			"""),_display_(/*11.5*/flash/*11.10*/.get("error")),format.raw/*11.23*/("""
		"""),format.raw/*12.3*/("""</div>
	""")))}),format.raw/*13.3*/("""

    """),format.raw/*15.5*/("""<!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*18.6*/form(action=routes.LoginController.registerUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*18.108*/ {_display_(Seq[Any](format.raw/*18.110*/("""
        """),format.raw/*19.37*/("""
        """),format.raw/*20.99*/("""
        """),_display_(/*21.10*/CSRF/*21.14*/.formField),format.raw/*21.24*/("""

        """),format.raw/*23.9*/("""<!-- Use helper methods to add fields to the form -->
        <!-- Note that the form fields are related to the fields of the itemForm object -->
        <!-- Note the arguments that are being passed to the scala function inputText (they are 
             essentially instructions for constructing an HTML input element)-->
        <!-- Note the """),_display_(/*27.24*/select),format.raw/*27.30*/(""" """),format.raw/*27.31*/("""function's argument options. This needs to be a map of ids-to-names
             and this is provided by the method Category.options(), which we added to the Category
             class in the previous step. -->
            """),_display_(/*30.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*30.88*/("""
            """),_display_(/*31.14*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*31.86*/("""
            """),_display_(/*32.14*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*32.94*/("""
            """),_display_(/*33.14*/inputText(userForm("password2"), '_label -> "Confirm Password", 'class -> "form-control")),format.raw/*33.103*/("""
            
            """),_display_(/*35.14*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*35.105*/("""
            """),_display_(/*36.14*/inputText(userForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*36.78*/("""
            
            """),format.raw/*38.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Register user" class="btn btn-primary">
                <a href=""""),_display_(/*44.27*/routes/*44.33*/.LoginController.registerUser()),format.raw/*44.64*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*48.6*/(""" """),format.raw/*48.24*/("""
""")))}),format.raw/*49.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.UserPassword2],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.UserPassword2],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 08 09:57:56 GMT 2019
                  SOURCE: /home/wdd/ca/SDEV4lab/lab7/app/views/registerUser.scala.html
                  HASH: 8d703cdd4202ee4a597d371728ec4d5e481f58f0
                  MATRIX: 999->1|1140->72|1184->70|1211->88|1238->90|1272->116|1310->117|1341->122|1408->214|1436->217|1474->247|1513->249|1543->252|1607->290|1621->295|1655->308|1685->311|1724->320|1757->326|2036->579|2148->681|2189->683|2226->720|2263->819|2300->829|2313->833|2344->843|2381->853|2755->1200|2782->1206|2811->1207|3063->1432|3158->1506|3199->1520|3292->1592|3333->1606|3434->1686|3475->1700|3586->1789|3640->1816|3753->1907|3794->1921|3879->1985|3933->2011|4323->2374|4338->2380|4390->2411|4550->2541|4579->2559|4611->2561
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|46->15|49->18|49->18|49->18|50->19|51->20|52->21|52->21|52->21|54->23|58->27|58->27|58->27|61->30|61->30|62->31|62->31|63->32|63->32|64->33|64->33|66->35|66->35|67->36|67->36|69->38|75->44|75->44|75->44|79->48|79->48|80->49
                  -- GENERATED --
              */
          