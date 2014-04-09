
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
/* newProduct Template File */
object newProduct extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Category],play.api.templates.HtmlFormat.Appendable] {

    /* newProduct Template File */
    def apply/*2.2*/(categories: List[Category]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.30*/("""
"""),_display_(Seq[Any](/*3.2*/main("Adding a product")/*3.26*/{_display_(Seq[Any](format.raw/*3.27*/("""
	
	
	<p><a href=""""),_display_(Seq[Any](/*6.15*/routes/*6.21*/.ProductController.showAllProducts)),format.raw/*6.55*/("""">Show all products</a></p>
	
		<form action="/new-product" method="post" role="form">
  		<div class="form-group">
    	<label for="product-name">Product name</label>
    	<input type="text" class="form-control" id="product-name" name="name" placeholder="Name..">
  		</div>
  		
  		<div class="form-group">
    	<label for="description">Description</label>
    	<input type="text" class="form-control" id="description" name="description" placeholder="Description..">
  		</div>
  		
  		<div class="form-group">
    	<label for="cost">Cost</label>
    	<input type="text" class="form-control" id="cost" name="cost" placeholder="Cost..">
  		</div>
  		
  		<div class="large-4 columns">
  		<label for="quantity">Quantity</label>
  		<input type = "number" class="form-control" style="width: 150px; id="quantity" name="quantity" placeholder="Quantity...">
  		</div>
  		
  		<div class="form-group">
    	<label for="category-name">Category</label>
    	
    	<select name="category-id" class="form-control" style="width: 200px;>
    		"""),_display_(Seq[Any](/*33.8*/for(category <- categories) yield /*33.35*/{_display_(Seq[Any](format.raw/*33.36*/("""
    		<option value=""""),_display_(Seq[Any](/*34.23*/category/*34.31*/.getId())),format.raw/*34.39*/("""">"""),_display_(Seq[Any](/*34.42*/category/*34.50*/.getName())),format.raw/*34.60*/(""" """),_display_(Seq[Any](/*34.62*/category/*34.70*/.products.size)),format.raw/*34.84*/(""" products)</option>
   			""")))})),format.raw/*35.8*/("""
    	</select>
  		</div>
  		<button type="submit" class="btn btn-default">Submit</button>
		</form>
		<p></p>
""")))})))}
    }
    
    def render(categories:List[Category]): play.api.templates.HtmlFormat.Appendable = apply(categories)
    
    def f:((List[Category]) => play.api.templates.HtmlFormat.Appendable) = (categories) => apply(categories)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 09 00:38:08 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/newProduct.scala.html
                    HASH: 53b0e93d6cacac963ae0060fd6f9730649ab1c94
                    MATRIX: 839->32|961->60|997->62|1029->86|1067->87|1121->106|1135->112|1190->146|2266->1187|2309->1214|2348->1215|2407->1238|2424->1246|2454->1254|2493->1257|2510->1265|2542->1275|2580->1277|2597->1285|2633->1299|2691->1326
                    LINES: 26->2|29->2|30->3|30->3|30->3|33->6|33->6|33->6|60->33|60->33|60->33|61->34|61->34|61->34|61->34|61->34|61->34|61->34|61->34|61->34|62->35
                    -- GENERATED --
                */
            