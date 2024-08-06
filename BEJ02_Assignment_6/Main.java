import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HouseholdManager manager = new HouseholdManager();

        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Welcome to the Household Income and Expense Manager");

            System.out.println("1. Add Income");

            System.out.println("2. Add Expense");

            System.out.println("3. View Category Totals");

            System.out.println("4. View Net Balance");

            System.out.println("5. Save Data");

            System.out.println("6. Load Data");

            System.out.println("7. Exit");

            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            scanner.nextLine(); // consume newline


            switch (choice) {

                case 1:
                    System.out.print("How many income categories do you want to input? ");
                    int numIncomeCategories = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    for (int i = 0; i < numIncomeCategories; i++) {
                        System.out.print("Enter category: ");
                        String incomeCategory = scanner.nextLine();
                        System.out.print("Enter amount: ");
                        double incomeAmount = scanner.nextDouble();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter month: ");
                        String incomeMonth = scanner.nextLine();
                        manager.addIncome(new Entry(incomeCategory, incomeAmount, incomeMonth));
                    }
                    break;

                case 2:
                    System.out.print("How many expense categories do you want to input? ");
                    int numExpenseCategories = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    for (int i = 0; i < numExpenseCategories; i++) {
                        System.out.print("Enter category: ");
                        String expenseCategory = scanner.nextLine();
                        System.out.print("Enter amount: ");
                        double expenseAmount = scanner.nextDouble();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter month: ");
                        String expenseMonth = scanner.nextLine();
                        manager.addExpense(new Entry(expenseCategory, expenseAmount, expenseMonth));
                    }
                    break;
                case 3:

                    System.out.print("Enter month: ");

                    String month = scanner.nextLine();

                    manager.displayCategoryTotals(month);

                    break;

                case 4:

                    System.out.print("Enter month: ");

                    String balanceMonth = scanner.nextLine();

                    double netBalance = manager.calculateNetBalance(balanceMonth);

                    System.out.println("Net Balance for " + balanceMonth + ": " + netBalance);

                    break;

               case 5:

                    System.out.print("Enter filename to save data: ");

                    String saveFilename = scanner.nextLine();

                    try {

                        manager.saveDataToFile("household.txt");

                        System.out.println("Data saved successfully.");

                    } catch (IOException e) {

                        System.out.println("Error saving data: " + e.getMessage());

                    }

                    break;

                case 6:
                    System.out.print("Enter filename to load data: ");
                    String loadFilename = scanner.nextLine();
                    try {
                        manager.loadDataFromFile(loadFilename);
                        System.out.println("Data loaded successfully.");
                        manager.printData(); // Print data after loading
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println("Error loading data: " + e.getMessage());
                    }
                    break;

                case 7:

                    System.out.println("Exiting...");

                    scanner.close();

                    return;

                default:

                    System.out.println("Invalid choice. Please try again.");

            }

        }

    }

}
