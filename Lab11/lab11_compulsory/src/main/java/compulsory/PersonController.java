package compulsory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    //return all the persons in db
    @GetMapping("/persons")
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    //add a new person in db
    @PostMapping("/person")
    public void newPerson(@RequestBody Person person) throws DataIntegrityViolationException {
        personService.newPerson(person);
    }

    //changes the name of a person finind it by id
    @PutMapping("/person/{userId}")
    public void updatePerson(
            @PathVariable("userId") Integer id,
            @RequestParam(required = false) String name
    ) {
        personService.updatePerson(id, name);
    }

    //delete a person by id
    @DeleteMapping("/person/{userId}")
    public void deletePerson(
            @PathVariable("userId") Integer id
    ) throws IdNotFoundException {
        personService.deletePerson(id);
    }


}