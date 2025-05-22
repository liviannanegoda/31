package com.example;

import com.example.model.Person;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Ivan", 25);
        String filename = "person.ser";
        Person.serialize(person, filename);
        Person.deserialize(filename);
    }
}
