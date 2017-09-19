package com.techprimers.controller;

import com.techprimers.model.User;
import com.techprimers.repository.UserJpaRepository;
import com.techprimers.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private UserJpaRespository userJpaRespository;
	@Autowired
	private UserService userService;

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/get/{name}")
    public User findByName(@PathVariable String name){
        return userService.findByName(name);
    }

    @PostMapping(value = "/save",
    produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public void saveUpdate(@RequestBody User user) {
    	userService.saveUpdate(user);  
    }
    
    @PutMapping(value = "/update")
    public void putMethod(@RequestBody User user) {
    	User existingEmp = userService.getById(user.getIdalumno());
		if (existingEmp == null) {
			System.out.println("Employee with id " + user.getIdalumno() + " does not exists");
			
		} else {
			userService.saveUpdate(user);
		}
    }
    
    @DeleteMapping(value = "/delete/{userId}")
    public void delete(@PathVariable int userId) {
    	//userService.delete(userId);  
    }
}
