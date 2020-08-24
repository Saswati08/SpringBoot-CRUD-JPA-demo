package com.example.webAppDemo.repository;
import com.example.webAppDemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {


//    List<Person> findAll();
//    void deleteById(Long id);
//



}
