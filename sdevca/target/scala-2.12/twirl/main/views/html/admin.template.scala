
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

object admin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Administrator],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.Administrator],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Administrator",user)/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""
    """),format.raw/*3.5*/("""<h1>Current Administrators</h1>


    """),format.raw/*6.71*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

    """),format.raw/*13.5*/("""<div class="col-sm-9">
        <h4>Here are all the current users on the system.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Email</th>
            <th>Role</th>
            <th>Name</th>
            <th>Password</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*28.62*/("""
            """),_display_(/*29.14*/for(u<-users) yield /*29.27*/ {_display_(Seq[Any](format.raw/*29.29*/("""
               """),format.raw/*30.16*/("""<tr>
                  <td>"""),_display_(/*31.24*/u/*31.25*/.getEmail),format.raw/*31.34*/("""</td>
                  <td>"""),_display_(/*32.24*/u/*32.25*/.getRole),format.raw/*32.33*/("""</td>
                  <td>"""),_display_(/*33.24*/u/*33.25*/.getName),format.raw/*33.33*/("""</td>
                  <td>"""),_display_(/*34.24*/u/*34.25*/.getPassword),format.raw/*34.37*/("""</td>
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*37.18*/routes/*37.24*/.HomeController.updateAdmin(u.getEmail)),format.raw/*37.63*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*43.18*/routes/*43.24*/.HomeController.deleteAdmin(u.getEmail)),format.raw/*43.63*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*48.14*/("""
        
        """),format.raw/*50.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*54.19*/routes/*54.25*/.HomeController.addAdmin()),format.raw/*54.51*/("""">
            <button class="btn btn-primary">Add a new Administrator</button>
        </a>
    </p>
</div>
 """)))}))
      }
    }
  }

  def render(users:List[models.users.Administrator],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(users,user)

  def f:((List[models.users.Administrator],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (users,user) => apply(users,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 08 09:57:56 GMT 2019
                  SOURCE: /home/wdd/ca/SDEV4lab/lab7/app/views/admin.scala.html
                  HASH: 6ee5f2cd2149c48e426a86aa4a9d875ec10d91b2
                  MATRIX: 992->1|1151->68|1185->94|1223->95|1254->100|1319->204|1347->207|1387->239|1426->241|1455->244|1518->282|1531->287|1566->302|1596->305|1634->313|1667->319|2126->799|2167->813|2196->826|2236->828|2280->844|2335->872|2345->873|2375->882|2431->911|2441->912|2470->920|2526->949|2536->950|2565->958|2621->987|2631->988|2664->1000|2766->1075|2781->1081|2841->1120|3068->1320|3083->1326|3143->1365|3369->1560|3414->1578|3490->1627|3505->1633|3552->1659
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|59->28|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|68->37|68->37|68->37|74->43|74->43|74->43|79->48|81->50|85->54|85->54|85->54
                  -- GENERATED --
              */
          