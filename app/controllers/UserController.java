package controllers;

import java.util.List;
import java.util.Map;

import play.data.*;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import models.Category;
import models.User;

public class UserController extends Controller{
	@Transactional
	public static Result newUser() {
		Map<String, String[]> form = request().body().asFormUrlEncoded();
		
		String name = form.get("name")[0];
		String email = form.get("email")[0];
		String password = form.get("password")[0];
		String address = form.get("address")[0];
		String teleNumber = form.get("telephoneNumber")[0];
		
		User user = new User();
		
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setAddress(address);
		user.setTeleNumber(teleNumber);
		
		JPA.em().persist(user);
		
		return redirect(routes.UserController.showNewUser());
	}
	@Transactional
	public static Result showNewUser(){
		List<User> users = JPA.em().createQuery("SELECT a FROM User a", User.class).getResultList();
		return ok(showNewUser.render(users));
	}
	@Transactional
	//@Security.Authenticated
	public static Result newUserForm(){
		return ok(newUser.render(null));
	}
	
	@Transactional
	public static Result showUser(int id) {
		User user = JPA.em().find(User.class, id);
		return ok(showUser.render(user));
	}
}
