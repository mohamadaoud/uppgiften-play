
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
/* showUser Template File */
object showUser extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.HtmlFormat.Appendable] {

    /* showUser Template File */
    def apply/*2.2*/(user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.14*/("""

"""),_display_(Seq[Any](/*4.2*/main("User.")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""
<h1>Details for user</h1>

<ul>
<li>Name: """),_display_(Seq[Any](/*8.12*/user/*8.16*/.getName())),format.raw/*8.26*/(""" <br>
<li>Address:  """),_display_(Seq[Any](/*9.16*/user/*9.20*/.getAddress)),format.raw/*9.31*/(""" </li>
<li>Telephone Number: """),_display_(Seq[Any](/*10.24*/user/*10.28*/.getTeleNumber())),format.raw/*10.44*/("""</li>
<li>E-mail: <a href="mailto:#">"""),_display_(Seq[Any](/*11.33*/user/*11.37*/.getEmail())),format.raw/*11.48*/("""</a></li>
</ul>
""")))})))}
    }
    
    def render(user:User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 08 17:55:56 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/showUser.scala.html
                    HASH: a741ab8677565cd4984ae9a31c983530b5eee779
                    MATRIX: 823->30|929->42|966->45|987->58|1026->60|1105->104|1117->108|1148->118|1204->139|1216->143|1248->154|1314->184|1327->188|1365->204|1439->242|1452->246|1485->257
                    LINES: 26->2|29->2|31->4|31->4|31->4|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11
                    -- GENERATED --
                */
            