package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {



    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("number of pets");
        int numPets = input1.nextInt();
        // take in numOfpets that runs numpets times, takes pet typ & pet name for
        // each
        // put in list
        // print out the value of the list at the end
        // or format into a string that displays that information

        Scanner input2 = new Scanner(System.in);
        System.out.println("kind of pet?");
        String typeOfPet = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.println("pet's name?");
        String petsName = input3.nextLine();
    }

    PetOwner kelly = new PetOwner();
    Pet kellyCat = new Cat("DaBaby", "Cat");


}
