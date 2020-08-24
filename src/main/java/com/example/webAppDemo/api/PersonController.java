package com.example.webAppDemo.api;

import com.example.webAppDemo.model.Person;
import com.example.webAppDemo.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/person")
@AllArgsConstructor
public class PersonController {

    private PersonService personService;



    @PostMapping
    public void createPerson(@RequestBody Person person)
    {
        personService.addPerson(person);

    }
    @GetMapping
    public List<Person> getAllPeople()
    {
        return personService.getAllPeople();
    }

    @DeleteMapping(path = "{id}")
    public void deletePerson(@PathVariable("id") Long id)
    {
        personService.deletePerson(id);
    }
    @PutMapping(path = "{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody Person person)
    {
        person.setId(id);
        personService.updatePerson(person);
    }

}
