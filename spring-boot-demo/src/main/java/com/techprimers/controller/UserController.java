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

    @GetMapping(value = "/all")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping(value = "/get/{name}")
    public User findByAlumno(@PathVariable final String name){
        return userService.findByAlumno(name);
    }

    @PostMapping(value = "/save",
    produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public void save(@RequestBody final User user) {
    	userService.save(user);
        
    }
}
