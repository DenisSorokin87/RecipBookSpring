package com.denis.recipebook.repositoresies;

import com.denis.recipebook.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value =
            "SELECT * FROM user u WHERE u.loginName = ?1 and u.password = ?2",
            nativeQuery = true)
    User makeLogin(String loginName, String password);

    @Query(value = "SELECT u FROM user u WHERE u.loginName = 1?",
            nativeQuery = true)
    Boolean isUserExist(String loginName);

}
