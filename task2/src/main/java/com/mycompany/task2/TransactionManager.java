/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2;

/**
 *
 * @author mostafa
 */
public class TransactionManager {
    private Transaction[] transactions;
    private int transactionCount;

    public TransactionManager() {
        transactions = new Transaction[100]; 
        transactionCount = 0;
    }

    public void addTransaction(String description, double amount, String category) {
        if (transactionCount == transactions.length) {
            resizeArray();
        }
        transactions[transactionCount++] = new Transaction(description, amount, category);
    }

    private void resizeArray() {
        Transaction[] newTransactions = new Transaction[transactions.length * 2];
        for (int i = 0; i < transactions.length; i++) {
            newTransactions[i] = transactions[i];
        }
        transactions = newTransactions;
    }

    public void displayTransactions() {
        if (transactionCount == 0) {
            System.out.println("No transactions available.");
            return;
        }
        System.out.println("Description    Amount    Category");
        for (int i = 0; i < transactionCount; i++) {
            System.out.printf("%-15s %-10.2f %s%n", transactions[i].getDescription(), transactions[i].getAmount(), transactions[i].getCategory());
        }
    }

    public void sortTransactionsByAmount() {
        for (int i = 0; i < transactionCount - 1; i++) {
            for (int j = 0; j < transactionCount - i - 1; j++) {
                if (transactions[j].getAmount() > transactions[j + 1].getAmount()) {
                    Transaction temp = transactions[j];
                    transactions[j] = transactions[j + 1];
                    transactions[j + 1] = temp;
                }
            }
        }
    }

    public void displaySummary() {
        double totalIncome = 0;
        double totalExpenses = 0;

        for (int i = 0; i < transactionCount; i++) {
            if (transactions[i].getAmount() > 0) {
                totalIncome += transactions[i].getAmount();
            } else {
                totalExpenses += transactions[i].getAmount();
            }
        }

        double balance = totalIncome + totalExpenses;  
        System.out.println("Total Income: " + totalIncome);
        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Balance: " + balance);
    }
    
    public void analyzeSpendingByCategory() {
    double totalExpenses = 0;
    for (int i = 0; i < transactionCount; i++) {
        if (transactions[i].getAmount() < 0) {
            totalExpenses += transactions[i].getAmount();
        }
    }

    if (totalExpenses == 0) {
        System.out.println("No expenses recorded.");
        return;
    }

    String[] categories = new String[transactionCount];
    double[] categoryTotals = new double[transactionCount];
    int categoryCount = 0;

    for (int i = 0; i < transactionCount; i++) {
        if (transactions[i].getAmount() < 0) {
            String category = transactions[i].getCategory();
            double amount = -transactions[i].getAmount(); 

            int index = -1;
            for (int j = 0; j < categoryCount; j++) {
                if (categories[j].equals(category)) {
                    index = j;
                    break;
                }
            }

            if (index == -1) {
                categories[categoryCount] = category;
                categoryTotals[categoryCount] = amount;
                categoryCount++;
            } else {
                categoryTotals[index] += amount;
            }
        }
    }

    System.out.println("Total Expenses: " + (-totalExpenses));
    System.out.println("Category    Spent    Percentage");

    for (int i = 0; i < categoryCount; i++) {
        double spent = categoryTotals[i];
        double percentage = (spent / -totalExpenses) * 100;
        System.out.printf("%-10s %-8.2f %.2f%%%n", categories[i], spent, percentage);
    }
}



    private boolean contains(String[] array, String value, int size) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
}
