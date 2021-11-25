package compulsory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersons() {
        return personRepository.findAll();

    }

    public void newPerson(Person person) {
      Person user=new Person() ;
      user.setId(person.getId());
      user.setName(person.getName());
      personRepository.save(user);


    }

    public void updatePerson(Integer id, String name) {
        personRepository.save(new Person(id, name));
    }

    public void deletePerson(Integer id) throws IdNotFoundException {
        boolean exist = personRepository.existsById(id);

        if(!exist){
            throw new IdNotFoundException("Not found user with id " + id);
        }

        personRepository.deleteById(id);
    }
}
