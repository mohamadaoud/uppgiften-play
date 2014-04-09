
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
/* showCategory Template File */
object showCategory extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Category,play.api.templates.HtmlFormat.Appendable] {

    /* showCategory Template File */
    def apply/*2.2*/(category: Category):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.22*/("""

"""),_display_(Seq[Any](/*4.2*/main("Category details")/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
<h1>Details for category</h1>

<ul>
<li>Name: """),_display_(Seq[Any](/*8.12*/category/*8.20*/.getName())),format.raw/*8.30*/("""<br><li>Description:  """),_display_(Seq[Any](/*8.53*/category/*8.61*/.getDescription)),format.raw/*8.76*/(""" </li><li>List: """),_display_(Seq[Any](/*8.93*/category/*8.101*/.products)),format.raw/*8.110*/("""</li></li>
</ul>
""")))})))}
    }
    
    def render(category:Category): play.api.templates.HtmlFormat.Appendable = apply(category)
    
    def f:((Category) => play.api.templates.HtmlFormat.Appendable) = (category) => apply(category)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 08 18:24:08 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/showCategory.scala.html
                    HASH: 2f50ed4fadd11e5865e6a0fa46462e962fbe7791
                    MATRIX: 839->34|953->54|990->57|1022->81|1061->83|1144->131|1160->139|1191->149|1249->172|1265->180|1301->195|1353->212|1370->220|1401->229
                    LINES: 26->2|29->2|31->4|31->4|31->4|35->8|35->8|35->8|35->8|35->8|35->8|35->8|35->8|35->8
                    -- GENERATED --
                */
            