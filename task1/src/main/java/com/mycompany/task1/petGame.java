/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task1;

import java.util.Scanner;

/**
 *
 * @author mostafa
 */
public class petGame {
     private pet pet;
    private Scanner scanner;
     public petGame() {
        scanner = new Scanner(System.in);
    }
      public void startGame() {
        while (true) {
            
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    adoptPet();
                    break;
                case 2:
                    if (pet != null) {
                        pet.feed();
                        if (isGameOver()) return;
                    } else {
                        System.out.println("You need to adopt a pet first.");
                    }
                    break;
                case 3:
                    if (pet != null) {
                        pet.play();
                         if (isGameOver()) return;

                    } else {
                        System.out.println("You need to adopt a pet first.");
                    }
                    break;
                case 4:
                    if (pet != null) {
                        pet.checkStatus();
                    } else {
                        System.out.println("You need to adopt a pet first.");
                    }
                    break;
                case 5:
                    endGame();
                    return;
                default:
                    System.out.println("invalid choice.Please choose a valid option.");
            }

            if (pet != null && pet.isCritical()) {
                System.out.println("critical level reached the game is over.");
                pet.checkStatus();
                return;
            }
        }
    }

    private void showMenu() {
        System.out.println("Pet Adoption Game Menu");
        System.out.println("1. Adopt a Pet");
        System.out.println("2. Feed the Pet");
        System.out.println("3. Play with the Pet");
        System.out.println("4. Check Pet Status");
        System.out.println("5. End Game");
        System.out.print("Choose an option: ");
    }

    private void adoptPet() {
        if (pet == null) {
            System.out.print("Enter the name of the pet: ");
            String name = scanner.nextLine();
            pet = new pet(name);
            System.out.println(name + " has been adopted!");
        } else {
            System.out.println("You already have a pet named " + pet.getName());
        }
    }

    private void endGame() {
        if (pet != null) {
            System.out.println("Final Status of " + pet.getName() + ":");
            pet.checkStatus();
        }
        System.out.println("Game Over. Thank you for playing!");
    }
    private boolean isGameOver() {
        if (pet.getHungerLevel() <= 0 || pet.getHappinessLevel() <= 0 ||
            pet.getHungerLevel() >= 90 || pet.getHappinessLevel() >= 90) {
            System.out.println("game Over ");
            System.out.println("final status of " + pet.getName() + ":");
            pet.checkStatus();
            return true;
        }
        return false;
    }

}
