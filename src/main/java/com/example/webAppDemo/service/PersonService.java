package com.example.webAppDemo.service;

import com.example.webAppDemo.repository.PersonRepo;
import com.example.webAppDemo.model.Person;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PersonService {

    private PersonRepo personRepo;


    public void addPerson(Person person)
    {

        personRepo.save(person);

    }
    public List<Person> getAllPeople()
    {
        return personRepo.findAll();
    }

    public void deletePerson(Long id)
    {
        personRepo.deleteById(id);
    }
    public void updatePerson(Person person)
    {
       personRepo.save(person);
    }

}
