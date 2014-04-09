
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
/* showNewUser Template File */
object showNewUser extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[User],play.api.templates.HtmlFormat.Appendable] {

    /* showNewUser Template File */
    def apply/*2.2*/(users: List[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.21*/("""
"""),_display_(Seq[Any](/*3.2*/main("User")/*3.14*/{_display_(Seq[Any](format.raw/*3.15*/("""
	
	<h3>Sign up!</h3>
	<hr>
	<p><a href=""""),_display_(Seq[Any](/*7.15*/routes/*7.21*/.UserController.newUserForm)),format.raw/*7.48*/("""">Register me!</a></p>
""")))})))}
    }
    
    def render(users:List[User]): play.api.templates.HtmlFormat.Appendable = apply(users)
    
    def f:((List[User]) => play.api.templates.HtmlFormat.Appendable) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 08 17:58:47 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/showNewUser.scala.html
                    HASH: e4c448ca0d0a9d391eb0b02bc183645c0b75b437
                    MATRIX: 838->33|951->52|987->54|1007->66|1045->67|1122->109|1136->115|1184->142
                    LINES: 26->2|29->2|30->3|30->3|30->3|34->7|34->7|34->7
                    -- GENERATED --
                */
            