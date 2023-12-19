package com.helloWorld.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helloWorld.controller.entity.UserEntities;

@Repository
public interface UserRepository extends JpaRepository<UserEntities, Long>{
	
	UserEntities findByUserName(String userName);

}
