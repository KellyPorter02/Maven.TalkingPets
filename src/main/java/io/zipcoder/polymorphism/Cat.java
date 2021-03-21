package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat(String name, String petType) {
        super(name,petType);
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
