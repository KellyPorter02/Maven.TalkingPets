package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {



    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("number of pets");
        int numPets = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("kind of pet?");
        String typeOfPet = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.println("pet's name?");
        String petsName = input3.nextLine();
    }
}
