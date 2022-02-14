package com.company;

import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
	// Pet Shop
        //Create a new project in InteliJ named Pets
        //Rename your Main file to PetShop(right-click -> Refactor -> Rename…)
        //Create 2 new classes
        //One class should be called Dog
        //One class should be called Cat
        //Each class should have at 3 properties
        //name
        //age
        //1 more of your choosing
        //Each class should have accessor methods for each property
        //In Petshop create two instances of each animal type
        //Set values for each property
        //Print a statement to the console saying “We have the following animals available: ” followed by property
        // values (name, age, etc)of each instance of Dog and Cat.
        //Bonus: Ask the user to pick the name of the animal that they want to purchase and check if that is
        // one of the 4 animal’s names. Tell the user whether the name is not a valid choice.

        Scanner nameScanner = new Scanner(System.in);


        Cat firstCat = new Cat();

        firstCat.setName("Patches");
        firstCat.setAge (4);
        firstCat.setColor("Orange");

        Cat secondCat = new Cat();

        secondCat.setName("Tommy");
        secondCat.setAge (9);
        secondCat.setColor ("White and black");

        Dog firstDog = new Dog();

        firstDog.setName("Sage");
        firstDog.setAge (3);
        firstDog.setColor ("Brown");

        Dog secondDog = new Dog();

        secondDog.setName ("Axel");
        secondDog.setAge (5);
        secondDog.setColor ("Gray");


        System.out.println("Please enter the name of the animal you would like to purchase?");
        String userInput = nameScanner.nextLine();

        if(userInput==firstCat.getName()){
            System.out.println("Valid Choice.");
        }

        System.out.println("We have the following animals available: ");
        System.out.println( "CATS - " + firstCat.getName() + " Age: " +
                firstCat.getAge() + " Color: " + firstCat.getColor()  +  secondCat.getName() + " Age: " +
                secondCat.getAge() + " Color: " +secondCat.getColor());
        System.out.println ("DOGS - " + firstDog.getName() + " Age: " +
                firstDog.getAge() + " Color: " + firstDog.getColor()  +  secondDog.getName() + " Age: " +
                secondDog.getAge() + " Color: " +secondDog.getColor());

    }
}
