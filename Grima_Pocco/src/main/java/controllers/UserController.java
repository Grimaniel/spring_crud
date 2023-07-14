package controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import models.UserModel;
import services.UserService;

@RestController
//@RequestMapping("/user")
//@GetMapping("/user")
//@RequestMapping(value = "/user", method = RequestMethod.GET)
public class UserController {

	@Autowired
	private UserService userService;
	
	//@GetMapping
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ArrayList<UserModel> getUsers(){
		return this.userService.getUsers();
	}
	
	@PostMapping
	public UserModel saveUser(@RequestBody UserModel user) {
		return this.userService.saveUser(user);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<UserModel> getUserById(@PathVariable Long id){
		return this.userService.getById(id);
	}
	
	@PutMapping(path = "/{id}")
	public UserModel updateUserById(@RequestBody UserModel request,@PathVariable("id") Long id) {
		return this.userService.updateById(request, id);
	}
	
	@DeleteMapping(path = "/{id}")
	public String deleteById(@PathVariable("id") Long id ) {
		
		boolean ok = this.userService.deleteUser(id);
		
		if(ok) {
			return "User con id = " + id + "eliminado";
		} else {
			return "Error, se presento un problema al eliminar";
		}
	}
}
