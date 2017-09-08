package com.techprimers.service;
import java.util.List;
import com.techprimers.model.User;

public interface UserService {

	List<User> findAll();
	
	User findByAlumno(String nombre);
	
	void save(User user);
}
