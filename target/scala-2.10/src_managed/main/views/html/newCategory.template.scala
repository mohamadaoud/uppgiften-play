
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
/* newCategory Template File */
object newCategory extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Category],play.api.templates.HtmlFormat.Appendable] {

    /* newCategory Template File */
    def apply/*2.2*/(categories: List[Category]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.30*/("""
"""),_display_(Seq[Any](/*3.2*/main("Adding a category")/*3.27*/{_display_(Seq[Any](format.raw/*3.28*/("""
	
	<p><a href=""""),_display_(Seq[Any](/*5.15*/routes/*5.21*/.CategoryController.showAllCategories)),format.raw/*5.58*/("""">Show all categories</a></p>
	
		<form action="/new-category" method="post" role="form">
  		<div class="form-group">
    	<label for="category-name">Category name</label>
    	<input type="text" class="form-control" id="category-name" name="name" placeholder="Name..">
  		</div>
  		
  		<div class="form-group">
    	<label for="category-description">Description</label>
    	<input type="text" class="form-control" id="description-name" name="description" placeholder="Description..">
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
                    DATE: Wed Apr 09 00:34:06 CEST 2014
                    SOURCE: /Users/mdaoud/Desktop/uppgiften-play/app/views/newCategory.scala.html
                    HASH: 5692a032750d51b0c74e43db49c27e8b296c658d
                    MATRIX: 842->33|964->61|1000->63|1033->88|1071->89|1123->106|1137->112|1195->149
                    LINES: 26->2|29->2|30->3|30->3|30->3|32->5|32->5|32->5
                    -- GENERATED --
                */
            