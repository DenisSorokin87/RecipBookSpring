package com.denis.recipebook.repositoresies;

import com.denis.recipebook.beans.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

//    @Query("SELECT * FROM user u WHERE u.loginName = ?1 and u.password = ?2")
//    User makeLogin(String loginName, String password);
//
//    @Query("SELECT u FROM user u WHERE u.loginName = 1?")
//    Boolean isUserExist(String loginName);

}
