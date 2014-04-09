package controllers;

import java.util.List;
import java.util.Map;

import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import models.Category;
import models.Product;
import models.ShoppingBasket;
import models.User;

public class ShoppingBasketController extends Controller{

	@Transactional
	public static Result newShoppingBasket() {
		Map<String, String[]> form = request().body().asFormUrlEncoded();
		
		int quantity = Integer.parseInt(form.get("quantity")[0]);
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		
		shoppingBasket.setQuantity(0);
		
		JPA.em().persist(shoppingBasket);
	
		return redirect(routes.ShoppingBasketController.listAllCart());
	}
	@Transactional
    public static Result showShoppingBasket(int id) {
    	ShoppingBasket shoppingBasket = JPA.em().find(ShoppingBasket.class, id);
    	return ok(showShoppingBasket.render(shoppingBasket));
    }
	
	@Transactional
	public static Result listAllCart(){
		List<Product> products = JPA.em().createQuery("SELECT a FROM Product a", Product.class).getResultList();
		List<User> users = JPA.em().createQuery("SELECT a FROM User a", User.class).getResultList();
		List<ShoppingBasket> shoppingbasket = JPA.em().createQuery("SELECT a FROM ShoppingBasket a", ShoppingBasket.class).getResultList();
		return ok(listAllCart.render(products, users, shoppingbasket));
	}
	@Transactional
	public static Result order(){
		return ok(order.render());
	}	
}
