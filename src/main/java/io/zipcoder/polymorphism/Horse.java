package io.zipcoder.polymorphism;

public class Horse extends Pet {


    public Horse(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Neigh";
    }
}
