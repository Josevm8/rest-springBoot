package com.techprimers.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techprimers.model.User;
import com.techprimers.repository.UserJpaRepository;
import com.techprimers.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
    private UserJpaRepository userJpaRepository;

	@Override
	public List<User> findAll() {
		return userJpaRepository.findAll();
	}

	@Override
	public User findByAlumno(String nombre) {
		return userJpaRepository.findByAlumno(nombre);
	}

	@Override
	public void save(User user) {
		userJpaRepository.save(user);
		
	}
	


}
