package com.techprimers.service;
import java.util.List;

public interface CrudService<E> {

	E saveUpdate(E entity);

	E getById(Integer id);

	List<E> getAll();
	
	E findByName(String name);
//
//	void delete(Serializable id);
}
