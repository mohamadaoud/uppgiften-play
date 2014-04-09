
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
object showAllCategories extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Category],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(categories: List[Category]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.30*/("""
"""),_display_(Seq[Any](/*2.2*/main("Categories")/*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""	
	
	<ul>
		"""),_display_(Seq[Any](/*5.4*/for(category <- categories) yield /*5.31*/{_display_(Seq[Any](format.raw/*5.32*/("""
		<li>"""),_display_(Seq[Any](/*6.8*/category/*6.16*/.getName())),format.raw/*6.26*/("""</li>
		""")))})),format.raw/*7.4*/("""
	</ul>
	
	<ul>
		<p><a href=""""),_display_(Seq[Any](/*11.16*/routes/*11.22*/.CategoryController.newCategoryForm)),format.raw/*11.57*/("""">Add a category!</a></p>
		<h4>Categories ("""),_display_(Seq[Any](/*12.20*/categories/*12.30*/.size)),format.raw/*12.35*/(""").</h4>
		"""),_display_(Seq[Any](/*13.4*/for(category <- categories) yield /*13.31*/{_display_(Seq[Any](format.raw/*13.32*/("""
			<li><a href="/category/"""),_display_(Seq[Any](/*14.28*/category/*14.36*/.getId())),format.raw/*14.44*/("""">"""),_display_(Seq[Any](/*14.47*/category/*14.55*/.getName())),format.raw/*14.65*/("""</a></li>
		""")))})),format.raw/*15.4*/("""
	</ul>

""")))})),format.raw/*18.2*/("""
	"""))}
    }
    
    def render(categories:List[Category]): play.api.templates.HtmlFormat.Appendable = apply(categories)
    
    def f:((List[Category]) => play.api.templates.HtmlFormat.Appendable) = (categories) => apply(categories)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 09 00:31:33 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/showAllCategories.scala.html
                    HASH: b284947b9d6af1ce597037d5bfdcce4ffe57d790
                    MATRIX: 794->1|916->29|952->31|978->49|1017->51|1064->64|1106->91|1144->92|1186->100|1202->108|1233->118|1272->127|1339->158|1354->164|1411->199|1492->244|1511->254|1538->259|1584->270|1627->297|1666->298|1730->326|1747->334|1777->342|1816->345|1833->353|1865->363|1909->376|1950->386
                    LINES: 26->1|29->1|30->2|30->2|30->2|33->5|33->5|33->5|34->6|34->6|34->6|35->7|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|42->14|42->14|42->14|43->15|46->18
                    -- GENERATED --
                */
            