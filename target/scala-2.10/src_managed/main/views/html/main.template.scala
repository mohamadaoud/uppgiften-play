
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>
<html><head>
	<meta charset="utf-8">
	<title>"""),_display_(Seq[Any](/*6.10*/title)),format.raw/*6.15*/("""</title>
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
	<link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
	<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="assets/stylesheets/base.css" />
	
		
	
</head><body>
	"""),_display_(Seq[Any](/*16.3*/topmenu())),format.raw/*16.12*/("""
	
	<div id="container">
	<div id="page">
		<!-- ==== START MASTHEAD ==== -->
		<header id="masthead" role="banner" class="clearfix">
			
			
			<div>
				<nav role="navigation">
					<ul class="nav">
						<li><a href="/" class="current">home</a></li>
						<li><a href="/show-all-products">Products</a></li>
						<li><a href="/show-all-categories">Categories</a></li>
						<li><a href="/show-new-user">Users</a></li>
						<li><a href="/list-all-cart">Shopping Basket</a></li>
					</ul>
					
				</nav>
				
				
			</div>
		</header>
		<!-- end #masthead -->
		
		<!-- ==== START MAIN CONTENT ==== -->
		<div id="main" role="main">
			<h1>Welcome to my webshop!</h1>
			
			<!-- Start Entry #1 -->
			<section class="entry">
				<header>
					"""),_display_(Seq[Any](/*48.7*/content)),format.raw/*48.14*/("""
				</header>

				
			</section>
			<!-- end .entry #3 -->
		</div>
		<!-- end #main content -->
		
		<!-- ==== START SIDEBAR ==== -->
		
		 <!-- end #related .sidebar -->	
			
		<!-- ==== START FOOTER ==== -->
		<footer id="footer" role="contentinfo">
			<h1></h1>
		</footer>
		<!-- end #footer -->
	</div>
	<!-- #page -->	
</div>
<!-- #container -->	
</body></html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 09 00:41:08 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/main.scala.html
                    HASH: 37ed2957e99a70cbd2820380882b8c0940fa3163
                    MATRIX: 778->1|902->31|1001->95|1027->100|1506->544|1537->553|2323->1304|2352->1311
                    LINES: 26->1|29->1|34->6|34->6|44->16|44->16|76->48|76->48
                    -- GENERATED --
                */
            