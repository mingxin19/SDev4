
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

object addItem extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.products.ItemOnSale],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(itemForm: Form[models.products.ItemOnSale],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Item",user)/*5.23*/{_display_(Seq[Any](format.raw/*5.24*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new item</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*11.6*/form(action=routes.HomeController.addItemSubmit(), 'class -> "form-horizontal", 'role -> "form",
            'method -> "POST", 'enctype -> "multipart/form-data")/*12.66*/ {_display_(Seq[Any](format.raw/*12.68*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""

        """),format.raw/*17.9*/("""<!-- Use helper methods to add fields to the form -->
        <!-- Note that the form fields are related to the fields of the itemForm object -->
        <!-- Note the arguments that are being passed to the scala function inputText (they are 
             essentially instructions for constructing an HTML input element)-->
        <!-- Note the """),_display_(/*21.24*/select),format.raw/*21.30*/(""" """),format.raw/*21.31*/("""function's argument options. This needs to be a map of ids-to-names
             and this is provided by the method Category.options(), which we added to the Category
             class in the previous step. -->
            """),_display_(/*24.14*/inputText(itemForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*24.86*/("""
            """),_display_(/*25.14*/for((value, name) <- products.Category.options) yield /*25.61*/{_display_(Seq[Any](format.raw/*25.62*/("""
                """),format.raw/*26.17*/("""<input type = "checkbox" name="catSelect[]" value=""""),_display_(/*26.69*/value),format.raw/*26.74*/("""" 
                    """),_display_(/*27.22*/if(itemForm("id").getValue.isPresent && itemForm("id").getValue.get !="")/*27.95*/{_display_(Seq[Any](format.raw/*27.96*/("""
                        """),_display_(/*28.26*/if(products.Category.inCategory(value.toLong, itemForm("id").getValue.get.toLong))/*28.108*/{_display_(Seq[Any](format.raw/*28.109*/("""
                            """),format.raw/*29.29*/("""checked
                        """)))}),format.raw/*30.26*/("""
                    """)))}),format.raw/*31.22*/("""
                """),format.raw/*32.17*/("""/> """),_display_(/*32.21*/name),format.raw/*32.25*/(""" """),format.raw/*32.26*/("""</br>
            """)))}),format.raw/*33.14*/("""
            """),format.raw/*34.13*/("""<p></p>
            
            """),_display_(/*36.14*/inputText(itemForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*36.100*/("""
            """),_display_(/*37.14*/inputText(itemForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*37.88*/("""
            """),_display_(/*38.14*/inputText(itemForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*38.88*/("""

            """),format.raw/*40.13*/("""<label>Image Upload</label>
            <input class ="btn-sm btn-default" type ="file" name ="upload">

            """),_display_(/*43.14*/inputText(itemForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*43.75*/("""
            
            """),format.raw/*45.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update item" class="btn btn-primary">
                <a href=""""),_display_(/*51.27*/routes/*51.33*/.HomeController.onsale(0)),format.raw/*51.58*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*55.6*/(""" """),format.raw/*55.24*/("""
""")))}),format.raw/*56.2*/(""" """))
      }
    }
  }

  def render(itemForm:Form[models.products.ItemOnSale],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(itemForm,user)

  def f:((Form[models.products.ItemOnSale],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (itemForm,user) => apply(itemForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 08 09:57:56 GMT 2019
                  SOURCE: /home/wdd/ca/SDEV4lab/lab7/app/views/addItem.scala.html
                  HASH: 58ac65e53c6f8754417e1c9d9e81d054e8fc377a
                  MATRIX: 994->1|1135->72|1179->70|1206->88|1233->90|1262->111|1300->112|1331->117|1650->410|1821->572|1861->574|1898->611|1935->710|1972->720|1985->724|2016->734|2053->744|2427->1091|2454->1097|2483->1098|2735->1323|2828->1395|2869->1409|2932->1456|2971->1457|3016->1474|3095->1526|3121->1531|3172->1555|3254->1628|3293->1629|3346->1655|3438->1737|3478->1738|3535->1767|3599->1800|3652->1822|3697->1839|3728->1843|3753->1847|3782->1848|3832->1867|3873->1880|3934->1914|4042->2000|4083->2014|4178->2088|4219->2102|4314->2176|4356->2190|4501->2308|4583->2369|4637->2395|5029->2760|5044->2766|5090->2791|5250->2921|5279->2939|5311->2941
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|42->11|43->12|43->12|44->13|45->14|46->15|46->15|46->15|48->17|52->21|52->21|52->21|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|61->30|62->31|63->32|63->32|63->32|63->32|64->33|65->34|67->36|67->36|68->37|68->37|69->38|69->38|71->40|74->43|74->43|76->45|82->51|82->51|82->51|86->55|86->55|87->56
                  -- GENERATED --
              */
          