package com.example.model;

import java.io.*;

public class Person implements Serializable {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "com.example.model.Person{name='" + name + "', age=" + age + "}";
    }

    public static void serialize(Person person, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Serialized: " + person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Person person = (Person) ois.readObject();
            System.out.println("Deserialized: " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
