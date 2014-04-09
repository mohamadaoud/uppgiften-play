
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
object showProduct extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Product,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(product: Product):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.20*/("""	
"""),_display_(Seq[Any](/*3.2*/main("Product details")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

<ul>
	<div class="large-4 columns">
		<h3>Product Details</h1>
		<form action=""""),_display_(Seq[Any](/*8.18*/routes/*8.24*/.ShoppingBasketController.newShoppingBasket)),format.raw/*8.67*/("""" method="post" role="form">
			<li>Name: """),_display_(Seq[Any](/*9.15*/product/*9.22*/.getName())),format.raw/*9.32*/(""" <br> </li>
			<li>Description:  """),_display_(Seq[Any](/*10.23*/product/*10.30*/.getDescription)),format.raw/*10.45*/(""" </li>
			<li>Price: """),_display_(Seq[Any](/*11.16*/product/*11.23*/.getCost())),format.raw/*11.33*/(""" </li>
  			<li><label for="quantity">Quantity</label></li>
  			<input type = "number" class="form-control" style="width: 150px; id="quantity" name="quantity" placeholder="Quantity...">
  		
			<button type="submit" class="btn btn-default">Add to Cart</button>
		</form>
	</div>
</ul>
<p></p>
""")))})))}
    }
    
    def render(product:Product): play.api.templates.HtmlFormat.Appendable = apply(product)
    
    def f:((Product) => play.api.templates.HtmlFormat.Appendable) = (product) => apply(product)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 09 21:27:47 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/showProduct.scala.html
                    HASH: 49e34a7fff8072ee9640f99ab2bba220b38835f9
                    MATRIX: 781->2|893->20|930->23|961->46|1000->48|1117->130|1131->136|1195->179|1273->222|1288->229|1319->239|1389->273|1405->280|1442->295|1500->317|1516->324|1548->334
                    LINES: 26->2|29->2|30->3|30->3|30->3|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11
                    -- GENERATED --
                */
            