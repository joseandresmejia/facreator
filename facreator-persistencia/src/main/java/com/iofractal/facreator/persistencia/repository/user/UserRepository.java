package com.iofractal.facreator.persistencia.repository.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iofractal.facreator.persistencia.entity.user.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
