
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
/* newUser Template File */
object newUser extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[User],play.api.templates.HtmlFormat.Appendable] {

    /* newUser Template File */
    def apply/*2.2*/(users: List[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.21*/("""
"""),_display_(Seq[Any](/*3.2*/main("Adding a user")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
	
		<form action="/new-user" method="post" role="form">
  		<div class="form-group">
    	<label for="email">Username</label>
    	<input type="text" class="form-control" id="email" name="email" placeholder="Username..">
  		</div>
  		
  		<div class="form-group">
    	<label for="password">Password</label>
    	<input type="text" class="form-control" id="password" name="password" placeholder="Password..">
  		</div>
  		
  		<div class="form-group">
  		<label for="name">Name</label>
    	<input type="text" class="form-control" id="name" name="name" placeholder="Name..">
  		</div>
  		
  		<div class="form-group">
  		<label for="address">Address</label>
    	<input type="text" class="form-control" id="address" name="address" placeholder="Address..">
  		</div>
  		
  		<div class="form-group">
    	<label for="telephoneNumber">Telephone Number</label>
    	<input type="text" class="form-control" id="telephoneNumber" name="telephoneNumber" placeholder="Telephone Number..">
  		</div>
  		<button type="submit" class="btn btn-default">Submit</button>
		</form>
	<p></p>
""")))})))}
    }
    
    def render(users:List[User]): play.api.templates.HtmlFormat.Appendable = apply(users)
    
    def f:((List[User]) => play.api.templates.HtmlFormat.Appendable) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 08 17:59:51 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/newUser.scala.html
                    HASH: edf33a1d6016d7fab11c7e876433a8397980f36b
                    MATRIX: 826->29|939->48|975->50|1004->71|1042->72
                    LINES: 26->2|29->2|30->3|30->3|30->3
                    -- GENERATED --
                */
            