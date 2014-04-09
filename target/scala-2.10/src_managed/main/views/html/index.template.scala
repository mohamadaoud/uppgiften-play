
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[Product],List[Category],List[User],List[ShoppingBasket],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(products: List[Product], categories: List[Category], users: List[User], shopping: List[ShoppingBasket]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.106*/("""


"""),_display_(Seq[Any](/*5.2*/main("Home")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""
	<h4>List of all products ("""),_display_(Seq[Any](/*6.29*/products/*6.37*/.size)),format.raw/*6.42*/(""").</h4>
	
	<ul>
		"""),_display_(Seq[Any](/*9.4*/for(product <- products) yield /*9.28*/{_display_(Seq[Any](format.raw/*9.29*/("""
			<li><a href="/product/"""),_display_(Seq[Any](/*10.27*/product/*10.34*/.getId())),format.raw/*10.42*/("""">"""),_display_(Seq[Any](/*10.45*/product/*10.52*/.getName())),format.raw/*10.62*/("""</a></li>
		""")))})),format.raw/*11.4*/("""
	</ul>
	
	<h4>Categories ("""),_display_(Seq[Any](/*14.19*/categories/*14.29*/.size)),format.raw/*14.34*/(""").</h4>
	
	<ul>
		"""),_display_(Seq[Any](/*17.4*/for(category <- categories) yield /*17.31*/{_display_(Seq[Any](format.raw/*17.32*/("""
			<li><a href="/category/"""),_display_(Seq[Any](/*18.28*/category/*18.36*/.getId())),format.raw/*18.44*/("""">"""),_display_(Seq[Any](/*18.47*/category/*18.55*/.getName())),format.raw/*18.65*/("""</a></li>
		""")))})),format.raw/*19.4*/("""
	</ul>
	
	<h4>Users ("""),_display_(Seq[Any](/*22.14*/users/*22.19*/.size)),format.raw/*22.24*/(""").</h4>
	
	<ul>
		"""),_display_(Seq[Any](/*25.4*/for(user <- users) yield /*25.22*/{_display_(Seq[Any](format.raw/*25.23*/("""
			<li><a href="/user/"""),_display_(Seq[Any](/*26.24*/user/*26.28*/.getId())),format.raw/*26.36*/("""">"""),_display_(Seq[Any](/*26.39*/user/*26.43*/.getName())),format.raw/*26.53*/(""" </a></li>
		""")))})),format.raw/*27.4*/("""
	</ul>
	
	<h4>Shopping Basket ("""),_display_(Seq[Any](/*30.24*/shopping/*30.32*/.size)),format.raw/*30.37*/(""").</h4>
	
	<ul>
		"""),_display_(Seq[Any](/*33.4*/for(shoppingBasket <- shopping) yield /*33.35*/{_display_(Seq[Any](format.raw/*33.36*/("""
			<li><a href="/shoppingbasket/"""),_display_(Seq[Any](/*34.34*/shoppingBasket/*34.48*/.getShoppingBaskedId())),format.raw/*34.70*/("""">"""),_display_(Seq[Any](/*34.73*/shoppingBasket/*34.87*/.getShoppingBaskedId())),format.raw/*34.109*/("""</a></li>
		""")))})),format.raw/*35.4*/("""
	</ul>
	
	
""")))})))}
    }
    
    def render(products:List[Product],categories:List[Category],users:List[User],shopping:List[ShoppingBasket]): play.api.templates.HtmlFormat.Appendable = apply(products,categories,users,shopping)
    
    def f:((List[Product],List[Category],List[User],List[ShoppingBasket]) => play.api.templates.HtmlFormat.Appendable) = (products,categories,users,shopping) => apply(products,categories,users,shopping)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 09 21:26:27 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/index.scala.html
                    HASH: 4df17579020049a9286ca0eab49d76a892b7a77b
                    MATRIX: 828->2|1027->106|1065->110|1085->122|1124->124|1188->153|1204->161|1230->166|1283->185|1322->209|1360->210|1423->237|1439->244|1469->252|1508->255|1524->262|1556->272|1600->285|1664->313|1683->323|1710->328|1764->347|1807->374|1846->375|1910->403|1927->411|1957->419|1996->422|2013->430|2045->440|2089->453|2148->476|2162->481|2189->486|2243->505|2277->523|2316->524|2376->548|2389->552|2419->560|2458->563|2471->567|2503->577|2548->591|2617->624|2634->632|2661->637|2715->656|2762->687|2801->688|2871->722|2894->736|2938->758|2977->761|3000->775|3045->797|3089->810
                    LINES: 26->2|29->2|32->5|32->5|32->5|33->6|33->6|33->6|36->9|36->9|36->9|37->10|37->10|37->10|37->10|37->10|37->10|38->11|41->14|41->14|41->14|44->17|44->17|44->17|45->18|45->18|45->18|45->18|45->18|45->18|46->19|49->22|49->22|49->22|52->25|52->25|52->25|53->26|53->26|53->26|53->26|53->26|53->26|54->27|57->30|57->30|57->30|60->33|60->33|60->33|61->34|61->34|61->34|61->34|61->34|61->34|62->35
                    -- GENERATED --
                */
            