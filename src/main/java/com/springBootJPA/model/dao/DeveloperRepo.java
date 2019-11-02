package com.springBootJPA.model.dao;

import com.springBootJPA.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//public interface DeveloperRepo extends CrudRepository<Developer, Integer> {

// for JSON format in optional
public interface DeveloperRepo extends JpaRepository<Developer, Integer> {

                        //field name
  List<Developer> findByLang(String lang);
                          //auto
  List<Developer> findByIdGreaterThan(int id);

  //make own query method, learn JPQL
  @Query("from Developer where lang=?1 order by name")
  List<Developer> findByLangSorted(String lang);

}
