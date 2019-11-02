package com.springBootJPA.model.dao;

import com.springBootJPA.model.Developer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeveloperRepo extends CrudRepository<Developer, Integer> {
  public List<Developer> findByLang(String lang);
}
