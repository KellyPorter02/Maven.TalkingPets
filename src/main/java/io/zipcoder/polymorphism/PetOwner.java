package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class PetOwner {

    private String name;
    private ArrayList<Pet> ownersPets = new ArrayList<>();

    public PetOwner() {
    }

    public void add(Pet pet) {
        ownersPets.add(pet);
    }

    public String ownedPets() {
        String temp = "";
        for (Pet element : ownersPets) {
            temp = temp.concat( element.getName() + element.getType() + element.speak() + "\n");
        }
        return temp;
    }
}




