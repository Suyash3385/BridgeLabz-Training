package com.constructors.levelone;
class Person {

    String name;
    int age;

    // Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

  //copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {

     
        Person p1 = new Person("Raj", 22);

        Person p2 = new Person(p1);

        p1.displayDetails();
        p2.displayDetails();
    }
}