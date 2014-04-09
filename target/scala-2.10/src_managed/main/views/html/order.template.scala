
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
object order extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*3.2*/main("Order is completed")/*3.28*/{_display_(Seq[Any](format.raw/*3.29*/("""
	
	<p>Your order has been completed. Thank you!</p>
	
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 09 21:27:20 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/order.scala.html
                    HASH: 2045077db949d5f5a6443b73e10ff20bf268e5c1
                    MATRIX: 864->3|898->29|936->30
                    LINES: 29->3|29->3|29->3
                    -- GENERATED --
                */
            