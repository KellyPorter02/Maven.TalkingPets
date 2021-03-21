package io.zipcoder.polymorphism;

public class Pet {

    private String name;
    private String petType;

    public Pet(String name, String petType) {
        this.name = name;
        this.petType = petType;
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

    public String getType() {
        return petType;
    }

}
