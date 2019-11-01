package com.springBootJPA.model.dao;

import com.springBootJPA.model.Developer;
import org.springframework.data.repository.CrudRepository;

public interface DeveloperRepo extends CrudRepository<Developer, Integer> {

}
