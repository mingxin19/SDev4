
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

object customer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.Customer],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Customer",user)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
    """),format.raw/*3.5*/("""<h1>Current Customer</h1>

    """),format.raw/*5.71*/("""
	"""),_display_(/*6.3*/if(flash.containsKey("success"))/*6.35*/ {_display_(Seq[Any](format.raw/*6.37*/("""
		"""),format.raw/*7.3*/("""<div class="alert alert-success">
			"""),_display_(/*8.5*/flash/*8.10*/.get("success")),format.raw/*8.25*/("""
		"""),format.raw/*9.3*/("""</div>
    """)))}),format.raw/*10.6*/("""

    """),format.raw/*12.5*/("""<div class="col-sm-9">
        <h4>Here are all the current customers on the system.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Email</th>
            <th>Role</th>
            <th>Name</th>
            <th>Password</th>
            <th>Date Of Birth</th>
            <th>Street 1</th>
            <th>Street 2</th>
            <th>Town</th>
            <th>Post Code</th>
            <th>Credit Card</th>

        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*34.62*/("""
            """),_display_(/*35.14*/for(u<-users) yield /*35.27*/ {_display_(Seq[Any](format.raw/*35.29*/("""
               """),format.raw/*36.16*/("""<tr>
                  <td>"""),_display_(/*37.24*/u/*37.25*/.getEmail),format.raw/*37.34*/("""</td>
                  <td>"""),_display_(/*38.24*/u/*38.25*/.getRole),format.raw/*38.33*/("""</td>
                  <td>"""),_display_(/*39.24*/u/*39.25*/.getName),format.raw/*39.33*/("""</td>
                  <td>"""),_display_(/*40.24*/u/*40.25*/.getPassword),format.raw/*40.37*/("""</td>
                  <td>"""),_display_(/*41.24*/u/*41.25*/.getDateOfBirth),format.raw/*41.40*/("""</td>
                  <td>"""),_display_(/*42.24*/u/*42.25*/.getStreet1),format.raw/*42.36*/("""</td>
                  <td>"""),_display_(/*43.24*/u/*43.25*/.getStreet2),format.raw/*43.36*/("""</td>
                  <td>"""),_display_(/*44.24*/u/*44.25*/.getTown),format.raw/*44.33*/("""</td>
                  <td>"""),_display_(/*45.24*/u/*45.25*/.getPostCode),format.raw/*45.37*/("""</td>
                  <td>"""),_display_(/*46.24*/u/*46.25*/.getCreditCard),format.raw/*46.39*/("""</td>
               
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*50.18*/routes/*50.24*/.HomeController.updateCustomer(u.getEmail)),format.raw/*50.66*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*56.18*/routes/*56.24*/.HomeController.deleteCustomer(u.getEmail)),format.raw/*56.66*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*61.14*/("""
        
        """),format.raw/*63.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*67.19*/routes/*67.25*/.HomeController.addCustomer()),format.raw/*67.54*/("""">
            <button class="btn btn-primary">Add a new Customer</button>
        </a>
    </p>

    </div>
""")))}))
      }
    }
  }

  def render(users:List[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(users,user)

  def f:((List[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (users,user) => apply(users,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 08 09:57:56 GMT 2019
                  SOURCE: /home/wdd/ca/SDEV4lab/lab7/app/views/customer.scala.html
                  HASH: 03b5679015e72d97aef1ff6543572913d02054ca
                  MATRIX: 990->1|1144->63|1173->84|1211->85|1242->90|1300->187|1328->190|1368->222|1407->224|1436->227|1499->265|1512->270|1547->285|1576->288|1618->300|1651->306|2300->976|2341->990|2370->1003|2410->1005|2454->1021|2509->1049|2519->1050|2549->1059|2605->1088|2615->1089|2644->1097|2700->1126|2710->1127|2739->1135|2795->1164|2805->1165|2838->1177|2894->1206|2904->1207|2940->1222|2996->1251|3006->1252|3038->1263|3094->1292|3104->1293|3136->1304|3192->1333|3202->1334|3231->1342|3287->1371|3297->1372|3330->1384|3386->1413|3396->1414|3431->1428|3549->1519|3564->1525|3627->1567|3854->1767|3869->1773|3932->1815|4158->2010|4203->2028|4279->2077|4294->2083|4344->2112
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|43->12|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|81->50|81->50|81->50|87->56|87->56|87->56|92->61|94->63|98->67|98->67|98->67
                  -- GENERATED --
              */
          