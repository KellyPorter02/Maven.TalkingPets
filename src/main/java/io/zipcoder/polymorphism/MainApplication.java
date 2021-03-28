package io.zipcoder.polymorphism;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPets;
        String typeOfPet;
        String petsName;
        ArrayList<Pet> ownersPets = new ArrayList<>();
        // take in numOfpets that runs numpets times, takes pet typ & pet name for
        // each
        // put in list
        // print out the value of the list at the end
        // or format into a string that displays that information



        System.out.println("How many pets do you have?");
        numPets = input.nextInt();
        typeOfPet = input.nextLine();

        for (int i = 0; i < numPets; i++) {

            System.out.println("What kind of pet is this pet?");
            typeOfPet = input.nextLine();

            System.out.println("What is the pet's name?");
            petsName = input.nextLine();

            if (typeOfPet.equalsIgnoreCase("dog")) {
                ownersPets.add(new Dog(petsName));
            } else if (typeOfPet.equalsIgnoreCase("cat")) {
                ownersPets.add(new Cat(petsName));
            } else if (typeOfPet.equalsIgnoreCase("horse")) {
                ownersPets.add(new Horse(petsName));
            } else {
                ownersPets.add(new Pet(petsName));
            }
        }

            for (int i = 0; i < ownersPets.size(); i++) {
                System.out.println(String.format("%s says %s", ownersPets.get(i).getName(), ownersPets.get(i).speak()));
            }






    }

}
