package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner caseswitchfirst = new Scanner(System.in); // switch 1
        System.out.println("Enter case number");
        int option = caseswitchfirst.nextInt();
        System.out.println(" case number:" + option);

    switch (option) {

        case 1:
            System.out.println("Add new pet");
            String[] animals = { "0.Dog" , "1.Cat" , "2.Tiger" , "3.Lemur"};
            System.out.println( animals [0] );
            System.out.println( animals [1] );
            System.out.println( animals [2] );
            System.out.println( animals [3] );
            //ArrayList<String> petsowned = new ArrayList<String>();

            Scanner caseaddnewpet = new Scanner(System.in);
            String selectnewpet;
                System.out.println("Please choose new pet (write the number of the pet only)");
                selectnewpet = caseaddnewpet.nextLine();
            System.out.println( animals [Integer.parseInt(selectnewpet)]);

            System.out.println("Write the name of your new pet"); // nume
            Scanner namecase = new Scanner(System.in);
            String selectnamenewpet = namecase.nextLine();
            //petsowned.add( new selectnamenewpet);
            System.out.println("Name of pet:" + " " + selectnamenewpet);

            System.out.println("Write the age of your new pet"); // varsta
            Scanner agecase = new Scanner(System.in);
            String selectagenewpet = agecase.nextLine();
            //petsowned.add(selectagenewpet);
            System.out.println("Age of pet:" + " " + selectagenewpet + " " + "years old");

            System.out.println("Please write the number of your pet and answer the following question");
            Scanner featurecase = new Scanner(System.in);
            int selectfeauturenewpet = featurecase.nextInt();
            switch (selectfeauturenewpet) {
                case 0 -> {
                    System.out.println("Is the dog of short, medium or tall height?");
                    Scanner featurecasezero = new Scanner(System.in);
                    String dogfeature = featurecasezero.nextLine();
                    System.out.println("Height of dog:" + " " + dogfeature + " " + "height");
                }
                //petsowned.add(dogfeature);
                case 1 -> {
                    System.out.println("What color/s is the cat?");
                    Scanner featurecaseone = new Scanner(System.in);
                    String catfeature = featurecaseone.nextLine();
                    System.out.println("Cat color/s:" + " " + catfeature);
                }
                //petsowned.add(catfeature);
                case 2 -> {
                    System.out.println("Is your tiger well adapted to it's new enviorment?");
                    Scanner featurecasetwo = new Scanner(System.in);
                    String tigerfeature = featurecasetwo.nextLine();
                    System.out.println("Behaviour of tiger in new enviorment:" + " " + tigerfeature);
                }
                //petsowned.add(tigerfeature);
                case 3 -> {
                    System.out.println("What food does your lemur prefer?");
                    Scanner featurecasethree = new Scanner(System.in);
                    String lemurfeature = featurecasethree.nextLine();
                    System.out.println("Lemur's favorite food:" + " " + lemurfeature);
                }
                //petsowned.add(lemurfeature);
            }
        case 2:
            //ArrayList<petsowned> = ArrayList<String>();
            System.out.println("List pets");
            //System.out.println(petsowned);

        case 3:
            System.out.println("Quit");
    }

    }
}
