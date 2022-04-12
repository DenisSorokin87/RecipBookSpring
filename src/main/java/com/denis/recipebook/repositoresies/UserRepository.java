package com.denis.recipebook.repositoresies;

import com.denis.recipebook.beans.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
