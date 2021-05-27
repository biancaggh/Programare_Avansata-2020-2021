package compulsory;

import javax.persistence.*;

@Entity
@Table(name = "Person")
public class Person {
    @Column(name = "nume")
    private String name;
    @Id
    private Integer id;

    public Person(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
