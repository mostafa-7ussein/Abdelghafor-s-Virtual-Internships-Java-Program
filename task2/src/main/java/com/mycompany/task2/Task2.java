/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task2;

import java.util.Scanner;

/**
 *
 * @author mostafa
 */
public class Task2 {

    public static void main(String[] args) {
 TransactionManager manager = new TransactionManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
           
            System.out.println("1. Input Transaction");
            System.out.println("2. View Transactions");
            System.out.println("3. View Summary");
            System.out.println("4. Get Insights");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: 
                    System.out.print("Enter transaction description: ");
                    String description = scanner.nextLine();

                    System.out.print("Enter transaction amount (positive for income, negative for expense): ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); 

                    System.out.print("Enter category  ");
                    String category = scanner.nextLine();

                    manager.addTransaction(description, amount, category);
                    break;

                case 2: 
                    System.out.println("All Transactions:");
                    manager.displayTransactions();

                    System.out.print("Do you want to sort transactions by amount? (y/n): ");
                    char sortChoice = scanner.next().charAt(0);
                    scanner.nextLine(); 

                    if (sortChoice == 'y' || sortChoice == 'Y') {
                        manager.sortTransactionsByAmount();
                        System.out.println("Transactions sorted by amount (low to high):");
                        manager.displayTransactions();
                    }
                    break;

                case 3:
                    System.out.println("Financial Summary:");
                    manager.displaySummary();
                    break;

                case 4: 
                    System.out.println("Spending Analysis by Category:");
                    manager.analyzeSpendingByCategory();
                    break;

                case 5: 
                    running = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
                    break;
            }

            System.out.println(); 
        }

        scanner.close();
    }
}
