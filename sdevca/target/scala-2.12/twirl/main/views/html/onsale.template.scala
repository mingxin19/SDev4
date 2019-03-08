
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

object onsale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.products.ItemOnSale],List[models.products.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.products.ItemOnSale],categories: List[models.products.Category],user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("On Sale",user)/*2.22*/{_display_(Seq[Any](format.raw/*2.23*/("""
    """),format.raw/*3.5*/("""<h1>On sale here</h1>


    """),format.raw/*6.74*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""
    """),format.raw/*12.5*/("""<div class="col-sm-3">
		<h4>Categories</h4>
	        <ul class="list-group">
                    <a href = """"),_display_(/*15.33*/routes/*15.39*/.HomeController.onsale(0)),format.raw/*15.64*/("""" class="list-group-item">All Categories</a>
		        """),_display_(/*16.12*/for(c<-categories) yield /*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
			        """),format.raw/*17.12*/("""<a href = """"),_display_(/*17.24*/routes/*17.30*/.HomeController.onsale(c.getId())),format.raw/*17.63*/("""" class="list-group-item catheight">"""),_display_(/*17.100*/c/*17.101*/.getName),format.raw/*17.109*/("""
                        """),format.raw/*18.25*/("""<span class="badge">"""),_display_(/*18.46*/c/*18.47*/.getItems.size),format.raw/*18.61*/("""</span> 
                    </a>
			    """)))}),format.raw/*20.9*/("""
            """),format.raw/*21.13*/("""</ul>
    </div>

    <div class="col-sm-9">
        <h4>Note that all products are second hand, unless otherwise stated.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Image</th>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*41.68*/("""
            """),_display_(/*42.14*/for(i<-items) yield /*42.27*/ {_display_(Seq[Any](format.raw/*42.29*/("""
               """),format.raw/*43.16*/("""<tr>
                  """),_display_(/*44.20*/if(env.resource("public/images/productImages/" + i.getId + "thumb.jpg").isDefined)/*44.102*/{_display_(Seq[Any](format.raw/*44.103*/("""
                        """),format.raw/*45.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*45.69*/(i.getId + "thumb.jpg")),format.raw/*45.92*/(""""/></td>
                  """)))}/*46.20*/else/*46.24*/{_display_(Seq[Any](format.raw/*46.25*/("""
                        """),format.raw/*47.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                  """)))}),format.raw/*48.20*/("""
                  """),format.raw/*49.19*/("""<td>"""),_display_(/*49.24*/i/*49.25*/.getId),format.raw/*49.31*/("""</td>
                  <td>"""),_display_(/*50.24*/i/*50.25*/.getName),format.raw/*50.33*/("""</td>
                  <td>"""),_display_(/*51.24*/i/*51.25*/.getDescription),format.raw/*51.40*/("""</td>
                  <td>"""),_display_(/*52.24*/i/*52.25*/.getStock),format.raw/*52.34*/("""</td>
                  <td>&euro; """),_display_(/*53.31*/("%.2f".format(i.getPrice))),format.raw/*53.58*/("""</td>

                  """),_display_(/*55.20*/if((user != null) && ("admin".equals(user.getRole())))/*55.74*/ {_display_(Seq[Any](format.raw/*55.76*/("""
                  """),format.raw/*56.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*58.18*/routes/*58.24*/.HomeController.updateItem(i.getId)),format.raw/*58.59*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*64.18*/routes/*64.24*/.HomeController.deleteItem(i.getId)),format.raw/*64.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
                  """)))}),format.raw/*68.20*/("""
               """),format.raw/*69.16*/("""</tr>
            """)))}),format.raw/*70.14*/("""
        
        """),format.raw/*72.9*/("""</tbody>
    </table>
    """),_display_(/*74.6*/if((user != null) && ("admin".equals(user.getRole())))/*74.60*/ {_display_(Seq[Any](format.raw/*74.62*/("""
    """),format.raw/*75.5*/("""<p>
        <a href=""""),_display_(/*76.19*/routes/*76.25*/.HomeController.addItem()),format.raw/*76.50*/("""">
            <button class="btn btn-primary">Add an item</button>
        </a>
    </p>
    """)))}),format.raw/*80.6*/("""
"""),format.raw/*81.1*/("""</div>
 """)))}))
      }
    }
  }

  def render(items:List[models.products.ItemOnSale],categories:List[models.products.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(items,categories,user,env)

  def f:((List[models.products.ItemOnSale],List[models.products.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (items,categories,user,env) => apply(items,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 08 09:57:56 GMT 2019
                  SOURCE: /home/wdd/ca/SDEV4lab/lab7/app/views/onsale.scala.html
                  HASH: 3074fb188e6b5f1aa7bbab33c62930b92af42b7a
                  MATRIX: 1045->1|1274->138|1302->158|1340->159|1371->164|1426->261|1454->264|1494->296|1533->298|1562->301|1625->339|1638->344|1673->359|1703->362|1741->370|1773->375|1910->485|1925->491|1971->516|2054->572|2088->590|2128->592|2168->604|2207->616|2222->622|2276->655|2341->692|2352->693|2382->701|2435->726|2483->747|2493->748|2528->762|2600->804|2641->817|3196->1399|3237->1413|3266->1426|3306->1428|3350->1444|3401->1468|3493->1550|3533->1551|3586->1576|3657->1620|3701->1643|3748->1671|3761->1675|3800->1676|3853->1701|3966->1783|4013->1802|4045->1807|4055->1808|4082->1814|4138->1843|4148->1844|4177->1852|4233->1881|4243->1882|4279->1897|4335->1926|4345->1927|4375->1936|4438->1972|4486->1999|4539->2025|4602->2079|4642->2081|4689->2100|4767->2151|4782->2157|4838->2192|5065->2392|5080->2398|5136->2433|5347->2613|5391->2629|5441->2648|5486->2666|5539->2693|5602->2747|5642->2749|5674->2754|5723->2776|5738->2782|5784->2807|5909->2902|5937->2903
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|72->41|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|79->48|80->49|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|86->55|86->55|86->55|87->56|89->58|89->58|89->58|95->64|95->64|95->64|99->68|100->69|101->70|103->72|105->74|105->74|105->74|106->75|107->76|107->76|107->76|111->80|112->81
                  -- GENERATED --
              */
          