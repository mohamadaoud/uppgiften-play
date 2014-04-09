
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
/* showShoppingBasket Template File */
object showShoppingBasket extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[ShoppingBasket,play.api.templates.HtmlFormat.Appendable] {

    /* showShoppingBasket Template File */
    def apply/*2.2*/(shoppingBasket: ShoppingBasket):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.34*/("""

"""),_display_(Seq[Any](/*4.2*/main("Welcome to Play.")/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
<h1>Shopping Basket</h1>

<ul>
<li>Quantity: """),_display_(Seq[Any](/*8.16*/shoppingBasket/*8.30*/.getQuantity())),format.raw/*8.44*/("""<br></li>
</ul>
""")))})))}
    }
    
    def render(shoppingBasket:ShoppingBasket): play.api.templates.HtmlFormat.Appendable = apply(shoppingBasket)
    
    def f:((ShoppingBasket) => play.api.templates.HtmlFormat.Appendable) = (shoppingBasket) => apply(shoppingBasket)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 08 13:37:46 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/showShoppingBasket.scala.html
                    HASH: 3a90b06d3cf3cc8613e0d00e56ef10b4d6a7e8e8
                    MATRIX: 863->40|989->72|1026->75|1058->99|1097->101|1179->148|1201->162|1236->176
                    LINES: 26->2|29->2|31->4|31->4|31->4|35->8|35->8|35->8
                    -- GENERATED --
                */
            