package com.cts.dao;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.pojos.User;

public interface UserRepository extends CrudRepository<User,String>{

	Optional<User> findByEmail(String emailId);

	User findByUserNameAndPasswordAndConfirmed(String userName, String password, String string);

	
	
	

}
