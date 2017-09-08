package com.techprimers.repository;
import com.techprimers.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJpaRepository extends JpaRepository<User, Long>{

	public User findByAlumno(String nombre);
}
