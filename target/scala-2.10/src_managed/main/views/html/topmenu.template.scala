
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
object topmenu extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
<div class="container">
	<nav class="navbar navbar-default" role="navigation">
	  <div class="container-fluid">
	    <!-- Brand and toggle get grouped for better mobile display -->
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" href="/">WebShop </a>
	    </div>

	    <!-- Collect the nav links, forms, and other content for toggling -->
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	      <ul class="nav navbar-nav">
	      </ul>
	"""),_display_(Seq[Any](/*20.3*/if(!session.containsKey("username"))/*20.39*/{_display_(Seq[Any](format.raw/*20.40*/("""
		  <form class="navbar-form navbar-right" action="/" method="post" role="form">
			"""),_display_(Seq[Any](/*22.5*/if(flash.containsKey("username-empty"))/*22.44*/{_display_(Seq[Any](format.raw/*22.45*/("""
				<div class="alert alert-warning">Username required.</div>
			""")))})),format.raw/*24.5*/("""
	 
			"""),_display_(Seq[Any](/*26.5*/if(flash.containsKey("password-empty"))/*26.44*/{_display_(Seq[Any](format.raw/*26.45*/("""
				<div class="alert alert-warning">Password required.</div>
			""")))})),format.raw/*28.5*/("""
			 
			"""),_display_(Seq[Any](/*30.5*/if(flash.containsKey("no-username-password-match"))/*30.56*/{_display_(Seq[Any](format.raw/*30.57*/("""
				<div class="alert alert-warning">No username exists with this password.</div>
			""")))})),format.raw/*32.5*/("""
			  <div class="form-group">
			    <label for="user-name"></label>
			    <input type="text" class="form-control" id="email" name="email" placeholder="Username..">
			  </div>
			  <div class="form-group">
			    <label for="passwd"></label>
			    <input type="text" class="form-control" id="passwd" name="passwd" placeholder="Password..">
			  </div>
				
				<div class="checkbox">
    			<label>
      			<input type="checkbox"> Remember me
    			</label>
  				</div>
			  <button type="submit" class="btn btn-default">Login</button>
			</form>
	
	
	""")))}/*51.4*/else/*51.9*/{_display_(Seq[Any](format.raw/*51.10*/("""
		<form class="navbar-form navbar-right" action="/" method="post" role="form">
	        <div class="form-group">
	         """),_display_(Seq[Any](/*54.12*/session/*54.19*/.get("username"))),format.raw/*54.35*/("""
	        </div>
	        <button type="submit" class="btn btn-default">Sign out</button>
	      </form>
	""")))})),format.raw/*58.3*/("""
	    </div><!-- /.navbar-collapse -->
	  </div><!-- /.container-fluid -->
	</nav>
</div>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 09 21:02:41 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/topmenu.scala.html
                    HASH: b3ee4218459a3dfa5cf94e1ea0eb606bf00e077d
                    MATRIX: 769->1|864->3|1695->799|1740->835|1779->836|1900->922|1948->961|1987->962|2085->1029|2128->1037|2176->1076|2215->1077|2313->1144|2358->1154|2418->1205|2457->1206|2575->1293|3153->1854|3165->1859|3204->1860|3365->1985|3381->1992|3419->2008|3557->2115
                    LINES: 26->1|29->1|48->20|48->20|48->20|50->22|50->22|50->22|52->24|54->26|54->26|54->26|56->28|58->30|58->30|58->30|60->32|79->51|79->51|79->51|82->54|82->54|82->54|86->58
                    -- GENERATED --
                */
            