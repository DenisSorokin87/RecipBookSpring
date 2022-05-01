package com.denis.recipebook.repositoresies;

import com.denis.recipebook.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value =
            "SELECT * FROM user u WHERE login_Name = :loginName and password = :password",
            nativeQuery = true)
    User makeLogin(String loginName, String password);

    @Query(value = "SELECT * FROM user u WHERE login_Name = :loginName",
            nativeQuery = true)
    User isUserExist(String loginName);

}
