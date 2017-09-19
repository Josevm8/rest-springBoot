package com.techprimers.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techprimers.model.User;
import com.techprimers.repository.UserJpaRepository;
import com.techprimers.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
    private UserJpaRepository userJpaRepository;

	@Override
	public List<User> getAll() {
		return userJpaRepository.findAll();
	}

	@Override
	public User findByName(String nombre) {
		return userJpaRepository.findByAlumno(nombre);
	}

	@Override
	public User saveUpdate(User user) {
		return userJpaRepository.save(user);
		
	}

	public User getById(Integer id) {
		return userJpaRepository.findByIdalumno(id);
		//return userJpaRepository.findOne((Long) id); En la tabla el tipo de dato del id debe ser Long para poder usar 
		//                                             el metodos que tiene JPA para buscar por id
	}

	
	
}
