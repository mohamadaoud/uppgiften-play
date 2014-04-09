// @SOURCE:/Users/mdaoud/Desktop/uppgiften-play/conf/routes
// @HASH:4225d4cc4cec98c6ff760578f16d3ec0de4d396e
// @DATE:Wed Apr 09 21:13:24 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:39
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:6
class ReverseDefaultController {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
class ReverseCategoryController {
    

// @LINE:29
def showCategory(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "category/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:27
def newCategoryForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "new-category")
}
                                                

// @LINE:28
def newCategory(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "new-category")
}
                                                

// @LINE:26
def showAllCategories(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "show-all-categories")
}
                                                
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseProductController {
    

// @LINE:17
def showProduct(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "product/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:16
def newProduct(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "new-product")
}
                                                

// @LINE:15
def newProductForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "new-product")
}
                                                

// @LINE:14
def showAllProducts(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "show-all-products")
}
                                                
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseUserController {
    

// @LINE:20
def showNewUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "show-new-user")
}
                                                

// @LINE:23
def showUser(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:21
def newUserForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "new-user")
}
                                                

// @LINE:22
def newUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "new-user")
}
                                                
    
}
                          

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseShoppingBasketController {
    

// @LINE:34
def newShoppingBasket(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "new-shoppingbasket")
}
                                                

// @LINE:33
def order(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "order-product")
}
                                                

// @LINE:32
def listAllCart(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "list-all-cart")
}
                                                

// @LINE:35
def showShoppingBasket(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shoppingbasket/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseMyAuthentication {
    

// @LINE:11
def logout(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:10
def login(): Call = {
   Call("POST", _prefix)
}
                                                

// @LINE:9
def showLoginForm(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:39
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseDefaultController {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DefaultController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
class ReverseCategoryController {
    

// @LINE:29
def showCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoryController.showCategory",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:27
def newCategoryForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoryController.newCategoryForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "new-category"})
      }
   """
)
                        

// @LINE:28
def newCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoryController.newCategory",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "new-category"})
      }
   """
)
                        

// @LINE:26
def showAllCategories : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoryController.showAllCategories",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "show-all-categories"})
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseProductController {
    

// @LINE:17
def showProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.showProduct",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:16
def newProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.newProduct",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "new-product"})
      }
   """
)
                        

// @LINE:15
def newProductForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.newProductForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "new-product"})
      }
   """
)
                        

// @LINE:14
def showAllProducts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.showAllProducts",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "show-all-products"})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseUserController {
    

// @LINE:20
def showNewUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.showNewUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "show-new-user"})
      }
   """
)
                        

// @LINE:23
def showUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.showUser",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:21
def newUserForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.newUserForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "new-user"})
      }
   """
)
                        

// @LINE:22
def newUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.newUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "new-user"})
      }
   """
)
                        
    
}
              

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseShoppingBasketController {
    

// @LINE:34
def newShoppingBasket : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShoppingBasketController.newShoppingBasket",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "new-shoppingbasket"})
      }
   """
)
                        

// @LINE:33
def order : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShoppingBasketController.order",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "order-product"})
      }
   """
)
                        

// @LINE:32
def listAllCart : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShoppingBasketController.listAllCart",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "list-all-cart"})
      }
   """
)
                        

// @LINE:35
def showShoppingBasket : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShoppingBasketController.showShoppingBasket",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shoppingbasket/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseMyAuthentication {
    

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MyAuthentication.logout",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:10
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MyAuthentication.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def showLoginForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MyAuthentication.showLoginForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:39
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:6
class ReverseDefaultController {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DefaultController.index(), HandlerDef(this, "controllers.DefaultController", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
class ReverseCategoryController {
    

// @LINE:29
def showCategory(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoryController.showCategory(id), HandlerDef(this, "controllers.CategoryController", "showCategory", Seq(classOf[Int]), "GET", """""", _prefix + """category/$id<[^/]+>""")
)
                      

// @LINE:27
def newCategoryForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoryController.newCategoryForm(), HandlerDef(this, "controllers.CategoryController", "newCategoryForm", Seq(), "GET", """""", _prefix + """new-category""")
)
                      

// @LINE:28
def newCategory(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoryController.newCategory(), HandlerDef(this, "controllers.CategoryController", "newCategory", Seq(), "POST", """""", _prefix + """new-category""")
)
                      

// @LINE:26
def showAllCategories(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoryController.showAllCategories(), HandlerDef(this, "controllers.CategoryController", "showAllCategories", Seq(), "GET", """Categories""", _prefix + """show-all-categories""")
)
                      
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseProductController {
    

// @LINE:17
def showProduct(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.showProduct(id), HandlerDef(this, "controllers.ProductController", "showProduct", Seq(classOf[Int]), "GET", """""", _prefix + """product/$id<[^/]+>""")
)
                      

// @LINE:16
def newProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.newProduct(), HandlerDef(this, "controllers.ProductController", "newProduct", Seq(), "POST", """""", _prefix + """new-product""")
)
                      

// @LINE:15
def newProductForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.newProductForm(), HandlerDef(this, "controllers.ProductController", "newProductForm", Seq(), "GET", """""", _prefix + """new-product""")
)
                      

// @LINE:14
def showAllProducts(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.showAllProducts(), HandlerDef(this, "controllers.ProductController", "showAllProducts", Seq(), "GET", """ Products""", _prefix + """show-all-products""")
)
                      
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseUserController {
    

// @LINE:20
def showNewUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.showNewUser(), HandlerDef(this, "controllers.UserController", "showNewUser", Seq(), "GET", """Users""", _prefix + """show-new-user""")
)
                      

// @LINE:23
def showUser(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.showUser(id), HandlerDef(this, "controllers.UserController", "showUser", Seq(classOf[Int]), "GET", """""", _prefix + """user/$id<[^/]+>""")
)
                      

// @LINE:21
def newUserForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.newUserForm(), HandlerDef(this, "controllers.UserController", "newUserForm", Seq(), "GET", """""", _prefix + """new-user""")
)
                      

// @LINE:22
def newUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.newUser(), HandlerDef(this, "controllers.UserController", "newUser", Seq(), "POST", """""", _prefix + """new-user""")
)
                      
    
}
                          

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseShoppingBasketController {
    

// @LINE:34
def newShoppingBasket(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShoppingBasketController.newShoppingBasket(), HandlerDef(this, "controllers.ShoppingBasketController", "newShoppingBasket", Seq(), "POST", """""", _prefix + """new-shoppingbasket""")
)
                      

// @LINE:33
def order(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShoppingBasketController.order(), HandlerDef(this, "controllers.ShoppingBasketController", "order", Seq(), "POST", """""", _prefix + """order-product""")
)
                      

// @LINE:32
def listAllCart(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShoppingBasketController.listAllCart(), HandlerDef(this, "controllers.ShoppingBasketController", "listAllCart", Seq(), "GET", """ShoppingBasket""", _prefix + """list-all-cart""")
)
                      

// @LINE:35
def showShoppingBasket(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShoppingBasketController.showShoppingBasket(id), HandlerDef(this, "controllers.ShoppingBasketController", "showShoppingBasket", Seq(classOf[Int]), "GET", """""", _prefix + """shoppingbasket/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseMyAuthentication {
    

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MyAuthentication.logout(), HandlerDef(this, "controllers.MyAuthentication", "logout", Seq(), "POST", """""", _prefix + """logout""")
)
                      

// @LINE:10
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MyAuthentication.login(), HandlerDef(this, "controllers.MyAuthentication", "login", Seq(), "POST", """""", _prefix + """""")
)
                      

// @LINE:9
def showLoginForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MyAuthentication.showLoginForm(), HandlerDef(this, "controllers.MyAuthentication", "showLoginForm", Seq(), "GET", """ Login/logout""", _prefix + """""")
)
                      
    
}
                          
}
        
    