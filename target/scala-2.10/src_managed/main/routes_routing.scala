// @SOURCE:/Users/mdaoud/Desktop/uppgiften-play/conf/routes
// @HASH:4225d4cc4cec98c6ff760578f16d3ec0de4d396e
// @DATE:Wed Apr 09 21:13:24 CEST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_DefaultController_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_MyAuthentication_showLoginForm1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:10
private[this] lazy val controllers_MyAuthentication_login2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:11
private[this] lazy val controllers_MyAuthentication_logout3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:14
private[this] lazy val controllers_ProductController_showAllProducts4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("show-all-products"))))
        

// @LINE:15
private[this] lazy val controllers_ProductController_newProductForm5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new-product"))))
        

// @LINE:16
private[this] lazy val controllers_ProductController_newProduct6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new-product"))))
        

// @LINE:17
private[this] lazy val controllers_ProductController_showProduct7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:20
private[this] lazy val controllers_UserController_showNewUser8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("show-new-user"))))
        

// @LINE:21
private[this] lazy val controllers_UserController_newUserForm9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new-user"))))
        

// @LINE:22
private[this] lazy val controllers_UserController_newUser10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new-user"))))
        

// @LINE:23
private[this] lazy val controllers_UserController_showUser11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_CategoryController_showAllCategories12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("show-all-categories"))))
        

// @LINE:27
private[this] lazy val controllers_CategoryController_newCategoryForm13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new-category"))))
        

// @LINE:28
private[this] lazy val controllers_CategoryController_newCategory14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new-category"))))
        

// @LINE:29
private[this] lazy val controllers_CategoryController_showCategory15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("category/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_ShoppingBasketController_listAllCart16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("list-all-cart"))))
        

// @LINE:33
private[this] lazy val controllers_ShoppingBasketController_order17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("order-product"))))
        

// @LINE:34
private[this] lazy val controllers_ShoppingBasketController_newShoppingBasket18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new-shoppingbasket"))))
        

// @LINE:35
private[this] lazy val controllers_ShoppingBasketController_showShoppingBasket19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shoppingbasket/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:39
private[this] lazy val controllers_Assets_at20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.DefaultController.index()"""),("""GET""", prefix,"""controllers.MyAuthentication.showLoginForm()"""),("""POST""", prefix,"""controllers.MyAuthentication.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.MyAuthentication.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """show-all-products""","""controllers.ProductController.showAllProducts()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new-product""","""controllers.ProductController.newProductForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new-product""","""controllers.ProductController.newProduct()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/$id<[^/]+>""","""controllers.ProductController.showProduct(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """show-new-user""","""controllers.UserController.showNewUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new-user""","""controllers.UserController.newUserForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new-user""","""controllers.UserController.newUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/$id<[^/]+>""","""controllers.UserController.showUser(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """show-all-categories""","""controllers.CategoryController.showAllCategories()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new-category""","""controllers.CategoryController.newCategoryForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new-category""","""controllers.CategoryController.newCategory()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """category/$id<[^/]+>""","""controllers.CategoryController.showCategory(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """list-all-cart""","""controllers.ShoppingBasketController.listAllCart()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """order-product""","""controllers.ShoppingBasketController.order()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new-shoppingbasket""","""controllers.ShoppingBasketController.newShoppingBasket()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shoppingbasket/$id<[^/]+>""","""controllers.ShoppingBasketController.showShoppingBasket(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_DefaultController_index0(params) => {
   call { 
        invokeHandler(controllers.DefaultController.index(), HandlerDef(this, "controllers.DefaultController", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_MyAuthentication_showLoginForm1(params) => {
   call { 
        invokeHandler(controllers.MyAuthentication.showLoginForm(), HandlerDef(this, "controllers.MyAuthentication", "showLoginForm", Nil,"GET", """ Login/logout""", Routes.prefix + """"""))
   }
}
        

// @LINE:10
case controllers_MyAuthentication_login2(params) => {
   call { 
        invokeHandler(controllers.MyAuthentication.login(), HandlerDef(this, "controllers.MyAuthentication", "login", Nil,"POST", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:11
case controllers_MyAuthentication_logout3(params) => {
   call { 
        invokeHandler(controllers.MyAuthentication.logout(), HandlerDef(this, "controllers.MyAuthentication", "logout", Nil,"POST", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:14
case controllers_ProductController_showAllProducts4(params) => {
   call { 
        invokeHandler(controllers.ProductController.showAllProducts(), HandlerDef(this, "controllers.ProductController", "showAllProducts", Nil,"GET", """ Products""", Routes.prefix + """show-all-products"""))
   }
}
        

// @LINE:15
case controllers_ProductController_newProductForm5(params) => {
   call { 
        invokeHandler(controllers.ProductController.newProductForm(), HandlerDef(this, "controllers.ProductController", "newProductForm", Nil,"GET", """""", Routes.prefix + """new-product"""))
   }
}
        

// @LINE:16
case controllers_ProductController_newProduct6(params) => {
   call { 
        invokeHandler(controllers.ProductController.newProduct(), HandlerDef(this, "controllers.ProductController", "newProduct", Nil,"POST", """""", Routes.prefix + """new-product"""))
   }
}
        

// @LINE:17
case controllers_ProductController_showProduct7(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.ProductController.showProduct(id), HandlerDef(this, "controllers.ProductController", "showProduct", Seq(classOf[Int]),"GET", """""", Routes.prefix + """product/$id<[^/]+>"""))
   }
}
        

// @LINE:20
case controllers_UserController_showNewUser8(params) => {
   call { 
        invokeHandler(controllers.UserController.showNewUser(), HandlerDef(this, "controllers.UserController", "showNewUser", Nil,"GET", """Users""", Routes.prefix + """show-new-user"""))
   }
}
        

// @LINE:21
case controllers_UserController_newUserForm9(params) => {
   call { 
        invokeHandler(controllers.UserController.newUserForm(), HandlerDef(this, "controllers.UserController", "newUserForm", Nil,"GET", """""", Routes.prefix + """new-user"""))
   }
}
        

// @LINE:22
case controllers_UserController_newUser10(params) => {
   call { 
        invokeHandler(controllers.UserController.newUser(), HandlerDef(this, "controllers.UserController", "newUser", Nil,"POST", """""", Routes.prefix + """new-user"""))
   }
}
        

// @LINE:23
case controllers_UserController_showUser11(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.UserController.showUser(id), HandlerDef(this, "controllers.UserController", "showUser", Seq(classOf[Int]),"GET", """""", Routes.prefix + """user/$id<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_CategoryController_showAllCategories12(params) => {
   call { 
        invokeHandler(controllers.CategoryController.showAllCategories(), HandlerDef(this, "controllers.CategoryController", "showAllCategories", Nil,"GET", """Categories""", Routes.prefix + """show-all-categories"""))
   }
}
        

// @LINE:27
case controllers_CategoryController_newCategoryForm13(params) => {
   call { 
        invokeHandler(controllers.CategoryController.newCategoryForm(), HandlerDef(this, "controllers.CategoryController", "newCategoryForm", Nil,"GET", """""", Routes.prefix + """new-category"""))
   }
}
        

// @LINE:28
case controllers_CategoryController_newCategory14(params) => {
   call { 
        invokeHandler(controllers.CategoryController.newCategory(), HandlerDef(this, "controllers.CategoryController", "newCategory", Nil,"POST", """""", Routes.prefix + """new-category"""))
   }
}
        

// @LINE:29
case controllers_CategoryController_showCategory15(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.CategoryController.showCategory(id), HandlerDef(this, "controllers.CategoryController", "showCategory", Seq(classOf[Int]),"GET", """""", Routes.prefix + """category/$id<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_ShoppingBasketController_listAllCart16(params) => {
   call { 
        invokeHandler(controllers.ShoppingBasketController.listAllCart(), HandlerDef(this, "controllers.ShoppingBasketController", "listAllCart", Nil,"GET", """ShoppingBasket""", Routes.prefix + """list-all-cart"""))
   }
}
        

// @LINE:33
case controllers_ShoppingBasketController_order17(params) => {
   call { 
        invokeHandler(controllers.ShoppingBasketController.order(), HandlerDef(this, "controllers.ShoppingBasketController", "order", Nil,"POST", """""", Routes.prefix + """order-product"""))
   }
}
        

// @LINE:34
case controllers_ShoppingBasketController_newShoppingBasket18(params) => {
   call { 
        invokeHandler(controllers.ShoppingBasketController.newShoppingBasket(), HandlerDef(this, "controllers.ShoppingBasketController", "newShoppingBasket", Nil,"POST", """""", Routes.prefix + """new-shoppingbasket"""))
   }
}
        

// @LINE:35
case controllers_ShoppingBasketController_showShoppingBasket19(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.ShoppingBasketController.showShoppingBasket(id), HandlerDef(this, "controllers.ShoppingBasketController", "showShoppingBasket", Seq(classOf[Int]),"GET", """""", Routes.prefix + """shoppingbasket/$id<[^/]+>"""))
   }
}
        

// @LINE:39
case controllers_Assets_at20(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     