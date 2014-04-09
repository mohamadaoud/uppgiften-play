
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
object listAllCart extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Product],List[User],List[ShoppingBasket],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(products: List[Product], users: List[User], shoppingbasket: List[ShoppingBasket] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.85*/("""
"""),_display_(Seq[Any](/*2.2*/main("Shopping Basket")/*2.25*/{_display_(Seq[Any](format.raw/*2.26*/("""
	<table class="form1 table table-bordered" style="
    width:600px;
    margin-top: 2%;
    margin-left: 2%;
    background-color:green;
    font-family:"Times New Roman",Georgia,Serif;
    font-color :white;
">
        <thead>
          <tr>
            <th>Name</th>
            <th>Cost</th>
            <th>Category</th>
            <th>Quantity</th>
          </tr>
        </thead>
        <tbody>
          <tr id="order-font">
          """),_display_(Seq[Any](/*21.12*/for(product <- products) yield /*21.36*/{_display_(Seq[Any](format.raw/*21.37*/("""
          	"""),_display_(Seq[Any](/*22.13*/for(shoppingbasket <- shoppingbasket) yield /*22.50*/{_display_(Seq[Any](format.raw/*22.51*/("""
         		 
           		<td>"""),_display_(Seq[Any](/*24.19*/product/*24.26*/.getName)),format.raw/*24.34*/("""</td>
           		<td>"""),_display_(Seq[Any](/*25.19*/product/*25.26*/.getCost)),format.raw/*25.34*/("""</td>
           		<td>"""),_display_(Seq[Any](/*26.19*/product/*26.26*/.category.getName)),format.raw/*26.43*/("""</td>
           		<td>"""),_display_(Seq[Any](/*27.19*/shoppingbasket/*27.33*/.getQuantity)),format.raw/*27.45*/("""</td>
          		</tr>
         	 	""")))})),format.raw/*29.14*/("""
           """)))})),format.raw/*30.13*/("""
        </tbody>
      </table>
      <form action="/order-product" method="post" role="form">
		<button type="submit" class="btn btn-default" style="margin-left: 2%;">Order</button></a>
		</form>
      <p></p>
         
""")))})))}
    }
    
    def render(products:List[Product],users:List[User],shoppingbasket:List[ShoppingBasket]): play.api.templates.HtmlFormat.Appendable = apply(products,users,shoppingbasket)
    
    def f:((List[Product],List[User],List[ShoppingBasket]) => play.api.templates.HtmlFormat.Appendable) = (products,users,shoppingbasket) => apply(products,users,shoppingbasket)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 09 21:26:47 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/listAllCart.scala.html
                    HASH: 6ec13c8f7926092534f82e66239a0bd86e0506a2
                    MATRIX: 819->1|996->84|1032->86|1063->109|1101->110|1584->557|1624->581|1663->582|1712->595|1765->632|1804->633|1872->665|1888->672|1918->680|1978->704|1994->711|2024->719|2084->743|2100->750|2139->767|2199->791|2222->805|2256->817|2325->854|2370->867
                    LINES: 26->1|29->1|30->2|30->2|30->2|49->21|49->21|49->21|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29|58->30
                    -- GENERATED --
                */
            