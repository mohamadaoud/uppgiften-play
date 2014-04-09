
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
/* showAllPro Template File */
object showAllProducts extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Product],play.api.templates.HtmlFormat.Appendable] {

    /* showAllPro Template File */
    def apply/*2.2*/(products: List[Product]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.27*/("""
"""),_display_(Seq[Any](/*3.2*/main("Products")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
	
	
	

	<ul>
		"""),_display_(Seq[Any](/*9.4*/for(product <- products) yield /*9.28*/{_display_(Seq[Any](format.raw/*9.29*/("""
		<li>"""),_display_(Seq[Any](/*10.8*/product/*10.15*/.getName())),format.raw/*10.25*/(""" - Category: """),_display_(Seq[Any](/*10.39*/product/*10.46*/.category.getName())),format.raw/*10.65*/("""</li>
		""")))})),format.raw/*11.4*/("""
	</ul>
	
	
	<ul>
		<p><a href=""""),_display_(Seq[Any](/*16.16*/routes/*16.22*/.ProductController.newProductForm)),format.raw/*16.55*/("""">Add a product!</a></p>
		<h4>Products ("""),_display_(Seq[Any](/*17.18*/products/*17.26*/.size)),format.raw/*17.31*/(""").</h4>
		"""),_display_(Seq[Any](/*18.4*/for(product <- products) yield /*18.28*/{_display_(Seq[Any](format.raw/*18.29*/("""
			<li><a href="/product/"""),_display_(Seq[Any](/*19.27*/product/*19.34*/.getId())),format.raw/*19.42*/("""">"""),_display_(Seq[Any](/*19.45*/product/*19.52*/.getName())),format.raw/*19.62*/("""</a></li>
		""")))})),format.raw/*20.4*/("""
	</ul>
	</div>
""")))})),format.raw/*23.2*/("""
"""))}
    }
    
    def render(products:List[Product]): play.api.templates.HtmlFormat.Appendable = apply(products)
    
    def f:((List[Product]) => play.api.templates.HtmlFormat.Appendable) = (products) => apply(products)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 09 00:35:54 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/showAllProducts.scala.html
                    HASH: 3bdfeab081c518544827a088478cf16e65772703
                    MATRIX: 843->32|962->57|998->59|1022->75|1061->77|1112->94|1151->118|1189->119|1232->127|1248->134|1280->144|1330->158|1346->165|1387->184|1427->193|1496->226|1511->232|1566->265|1644->307|1661->315|1688->320|1734->331|1774->355|1813->356|1876->383|1892->390|1922->398|1961->401|1977->408|2009->418|2053->431|2101->448
                    LINES: 26->2|29->2|30->3|30->3|30->3|36->9|36->9|36->9|37->10|37->10|37->10|37->10|37->10|37->10|38->11|43->16|43->16|43->16|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|46->19|46->19|46->19|47->20|50->23
                    -- GENERATED --
                */
            