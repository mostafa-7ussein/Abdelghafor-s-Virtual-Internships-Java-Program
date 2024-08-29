
package assignment_2;
import java.util.*;
public class Assignment_2 {
    static List<String> descriptions = new ArrayList<>();
    static List<Double> amounts = new ArrayList<>();
    static List<String> categories = new ArrayList<>();

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Transaction");
            System.out.println("2. View Transactions");
            System.out.println("3. View Summary");
            System.out.println("4. Get Insights");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> inputTransaction(scanner);
                case 2 -> {
                    System.out.print("Sort by amount? (yes/no): ");
                    boolean sortByAmount = scanner.next().equalsIgnoreCase("yes");
                    viewTransactions(sortByAmount);
                }
                case 3 -> viewSummary();
                case 4 -> getInsights();
                case 5 -> exit = true;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    public static void inputTransaction(Scanner scanner) {
        System.out.print("Enter description: ");
        scanner.nextLine(); 
        String description = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter category: ");
        scanner.nextLine(); 
        String category = scanner.nextLine();

       
        descriptions.add(description);
        amounts.add(amount);
        categories.add(category);

        System.out.println("Transaction added successfully!");
    }

    public static void viewTransactions(boolean sortByAmount) {
        if (descriptions.isEmpty()) {
            System.out.println("No transactions to display.");
            return;
        }

        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < descriptions.size(); i++) {
            indices.add(i);
        }

        if (sortByAmount) {
           
            for (int i = 0; i < indices.size() - 1; i++) {
                for (int j = 0; j < indices.size() - i - 1; j++) {
                    if (amounts.get(indices.get(j)) > amounts.get(indices.get(j + 1))) {
                        int temp = indices.get(j);
                        indices.set(j, indices.get(j + 1));
                        indices.set(j + 1, temp);
                    }
                }
            }
        }

        System.out.println(String.format("%-20s %10s %-15s", "Description", "Amount", "Category"));
        System.out.println("----------------------------------------------------------");

        for (int index : indices) {
            System.out.println(String.format("%-20s %10.2f %-15s", descriptions.get(index), amounts.get(index), categories.get(index)));
        }
    }

    public static void viewSummary() {
        if (descriptions.isEmpty()) {
            System.out.println("No transactions to summarize.");
            return;
        }

        double totalIncome = 0;
        double totalExpenses = 0;

        for (double amount : amounts) {
            if (amount > 0) {
                totalIncome += amount;
            } else if (amount<0) {
                totalExpenses += amount;
            }
        }

        double balance = totalIncome + totalExpenses;

        System.out.println("Total Income: " + totalIncome);
        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Balance: " + balance);
    }

    public static void getInsights() {
        if (descriptions.isEmpty()) {
            System.out.println("No transactions to analyze.");
            return;
        }

        double totalExpenses = 0;
        for (double amount : amounts) {
            if (amount < 0) {
                totalExpenses += amount;
            }
        }

        System.out.println("Expense Insights by Category:");

        List<String> uniqueCategories = new ArrayList<>();
        for (String category : categories) {
            if (!uniqueCategories.contains(category)) {
                uniqueCategories.add(category);
            }
        }

        for (String category : uniqueCategories) {
            double categoryTotal = 0;
            for (int i = 0; i < descriptions.size(); i++) {
                if (categories.get(i).equalsIgnoreCase(category) && amounts.get(i) < 0) {
                    categoryTotal += amounts.get(i);
                }
            }

            double percentage = (categoryTotal / totalExpenses) * 100;
            System.out.println(String.format("%-15s %10.2f %10.2f%%", category, categoryTotal, percentage));
        }
    }
}
