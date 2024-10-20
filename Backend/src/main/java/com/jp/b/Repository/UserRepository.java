package com.jp.b.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.b.Entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
	

	
	    User findByEmail(String email);
	    
}


