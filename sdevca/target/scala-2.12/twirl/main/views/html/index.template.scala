
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
/*1.2*/import models.users.User

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""
"""),_display_(/*3.2*/main("Home", user)/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<h1>Meowdy.</h1>
""")))}),format.raw/*5.2*/("""  """))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 08 10:17:31 GMT 2019
                  SOURCE: /home/wdd/ca/SDEV4lab/sdevca/app/views/index.scala.html
                  HASH: d2b3d49ef976b94a7f3f65681553448e490c53bd
                  MATRIX: 651->1|978->28|1085->40|1113->43|1139->61|1177->62|1209->68|1257->87
                  LINES: 24->1|29->2|34->2|35->3|35->3|35->3|36->4|37->5
                  -- GENERATED --
              */
          