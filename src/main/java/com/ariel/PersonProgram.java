package com.ariel;

import com.ariel.Models.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PersonProgram {

    private List<Person> people;

    private Scanner scan = new Scanner(System.in);

    public PersonProgram(){
        people = new LinkedList<>();
    }

    public String GetAllPerson(){
        if(this.people.isEmpty()){
            System.out.println("There're no person");
            System.out.println("Wanna exit?");
            return scan.next();
        }
        for(Person person: this.people){
            System.out.println("#########################################################");
            System.out.println("Name: "+person.getName());
            System.out.println("Last name: "+person.getLastName());
            System.out.println("Age: "+person.getAge());
            System.out.println("#########################################################");
        }
        System.out.println("Wanna exit?");
        return scan.next();
    }

    public String SavePerson( String name, String lastName, int age){
        if(name == null || lastName == null || age == 0){
            System.out.println("Incomplete data");
            System.out.println("Wanna exit?");
            return scan.next();
        }
        Person personToSave = new Person(name, lastName, age);

        this.people.add(personToSave);
        System.out.println("Wanna exit?");
        return scan.next();
    }

    public String saludar(){
        if(this.people.isEmpty()){
            System.out.println("There're no person");
            System.out.println("Wanna exit?");
            return scan.next();
        }

        for(Person person: this.people){
            System.out.println(person.Saludar());
        }

        System.out.println("Wanna exit?");
        return scan.next();
    }
}
