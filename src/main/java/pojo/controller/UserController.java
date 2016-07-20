package pojo.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.entity.User;
import pojo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/*@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public String deleteAUser(@PathVariable("id") int id){
		
		boolean status=userService.deleteAUser(id);
		System.out.println(status);
		return "index";
	}
	*/
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public String detail(){
		ArrayList<User> arruser=userService.getAllUsers();
		System.out.print(arruser);
		return "detail";
	}
}
