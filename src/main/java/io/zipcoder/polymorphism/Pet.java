package io.zipcoder.polymorphism;

public class Pet {

    private String name;


    public Pet(String name) {
        this.name = name;

    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }


    public String speak() {
        return "animal noises";
    }



}
