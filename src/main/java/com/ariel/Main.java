package com.ariel;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
    PersonProgram personProgram = new PersonProgram();
        Scanner scanner = new Scanner(System.in);

    String opc = "";
    int option;
    String name ;
    String lastName;
    int age;
    System.out.println("Welcome to person program");
        do{
            System.out.println("Chose option");
            System.out.println("1- Get people");
            System.out.println("2- Save person");
            System.out.println("3- Saludar personas");
            option = scanner.nextInt();
            switch(option){
                case 1:
                    opc = personProgram.GetAllPerson();
                    break;
                case 2:
                    System.out.println("Insert name");
                    name = scanner.next();
                    System.out.println("Insert lastName");
                    lastName = scanner.next();
                    System.out.println("Insert age");
                    age = scanner.nextInt();
                    opc = personProgram.SavePerson(name, lastName, age);
                    break;
                case 3:
                    opc = personProgram.saludar();

            }
        }while(!opc.equals("yes"));
    }
}
