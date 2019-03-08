
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(pagename: String, user: User)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<!DOCTYPE HTML>

<html>
	<head>
		<title>FishBone Games</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="icon" type="image/png" href=""""),_display_(/*11.44*/routes/*11.50*/.Assets.versioned("images/favicon.png")),format.raw/*11.89*/("""">
		<link rel="stylesheet" href="assets/stylesheets/main2.css" />
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	<body>

		<!-- Header -->
			<header id="header" class="alt">
				<div class="logo"></div>
				<a href="#menu">Menu</a>
			</header>

		<!-- Nav -->
			<nav id="menu">
				<ul class="links">
					"""),_display_(/*26.7*/if(user != null)/*26.23*/ {_display_(Seq[Any](format.raw/*26.25*/("""
					
					"""),format.raw/*28.6*/("""<li><a href=""""),_display_(/*28.20*/routes/*28.26*/.LoginController.logout()),format.raw/*28.51*/(""""><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
					""")))}/*29.8*/else/*29.13*/{_display_(Seq[Any](format.raw/*29.14*/("""
					"""),format.raw/*30.6*/("""<li><a href=""""),_display_(/*30.20*/routes/*30.26*/.HomeController.addCustomer()),format.raw/*30.55*/(""""><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					<li><a href=""""),_display_(/*31.20*/routes/*31.26*/.LoginController.login()),format.raw/*31.50*/(""""><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
					""")))}),format.raw/*32.7*/("""
				"""),format.raw/*33.5*/("""</ul>
			</nav>

		<!-- Banner -->
			<section id="banner">
				<div class="inner">
					<header>
						<a href='"""),_display_(/*40.17*/routes/*40.23*/.ProjectCtrl.listProjects(0)),format.raw/*40.51*/("""'><img src="/assets/images/logo.png" width='300px' height='300px' alt="logo"></a>
						<h1>This is the Fishbone Games employee project portal.</h1>
						"""),_display_(/*42.8*/if(user != null)/*42.24*/ {_display_(Seq[Any](format.raw/*42.26*/("""
						"""),format.raw/*43.7*/("""<p>Wellcome to the Project Portal</p>
						
						""")))}/*45.9*/else/*45.14*/{_display_(Seq[Any](format.raw/*45.15*/("""
						"""),format.raw/*46.7*/("""<p>Please Login / Sign Up to access the Project Portal</p>
						<a href="#menu" class="button big scrolly">Login</a>
						
						<script type="text/javascript">
						
						if (window.location.href== "http://localhost:9000/listProjects") """),format.raw/*51.72*/("""{"""),format.raw/*51.73*/("""
  							 """),format.raw/*52.11*/("""window.location.href = 'http://localhost:9000/login'; 
						"""),format.raw/*53.7*/("""}"""),format.raw/*53.8*/("""
    						
						
						"""),format.raw/*56.7*/("""</script>
						""")))}),format.raw/*57.8*/("""
					"""),format.raw/*58.6*/("""</header>
					
				</div>
			</section>

		<!-- Main -->

			<div id="main">
			<section class="wrapper style1">
			"""),_display_(/*67.5*/content),format.raw/*67.12*/("""
			"""),format.raw/*68.4*/("""</section>

				<!--
					<section class="wrapper style1">
						<div class="inner">
							
								<div class="flex flex-2">
									<div class="col col1">
										<div class="image round fit">
											<a href="generic.html" class="link"><img src="images/pic01.jpg" alt="" /></a>
										</div>
									</div>
									<div class="col col2">
										<h3>Maecenas a gravida quam</h3>
										
										
										
									</div>
								</div>
						</div>
					</section>
				--!>
			

				
		<!-- Footer -->
			<footer id="footer">
				<div class="copyright">
					<ul class="icons">
						<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
						<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
						<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
						<li><a href="#" class="icon fa-snapchat"><span class="label">Snapchat</span></a></li>
					</ul>
					<p>&copy; Fishbone Games. All rights reserved.</p>
				</div>
			</footer>

		<!-- Scripts -->
			<script src="/assets/javascripts/jquery.min.js"></script>
			<script src="/assets/javascripts/jquery.scrolly.min.js"></script>
			<script src="/assets/javascripts/jquery.scrollex.min.js"></script>
			<script src="/assets/javascripts/skel.min.js"></script>
			<script src="/assets/javascripts/util.js"></script>
			<script src="/assets/javascripts/main.js"></script>

	</body>
</html>"""))
      }
    }
  }

  def render(pagename:String,user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 08 10:01:07 GMT 2019
                  SOURCE: /home/wdd/ca/SDEV4lab/lab7/app/views/main.scala.html
                  HASH: f351c22250bdc50ff1819601ecd6e422089b5c8f
                  MATRIX: 651->1|989->27|1127->72|1464->382|1479->388|1539->427|1933->795|1958->811|1998->813|2037->825|2078->839|2093->845|2139->870|2230->944|2243->949|2282->950|2315->956|2356->970|2371->976|2421->1005|2533->1090|2548->1096|2593->1120|2695->1192|2727->1197|2868->1311|2883->1317|2932->1345|3114->1501|3139->1517|3179->1519|3213->1526|3283->1579|3296->1584|3335->1585|3369->1592|3638->1833|3667->1834|3706->1845|3794->1906|3822->1907|3874->1932|3921->1949|3954->1955|4098->2073|4126->2080|4157->2084
                  LINES: 24->1|29->2|34->3|42->11|42->11|42->11|57->26|57->26|57->26|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|64->33|71->40|71->40|71->40|73->42|73->42|73->42|74->43|76->45|76->45|76->45|77->46|82->51|82->51|83->52|84->53|84->53|87->56|88->57|89->58|98->67|98->67|99->68
                  -- GENERATED --
              */
          