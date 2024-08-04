import java.util.*;
import java.io.*;

public class HouseholdManager {

    private Map<String, List<Entry>> incomeData = new HashMap<>();

    private Map<String, List<Entry>> expenseData = new HashMap<>();


    public void addIncome(Entry income) {

        String month = income.getMonth();

        if (!incomeData.containsKey(month)) {

            incomeData.put(month, new ArrayList<>());

        }

        incomeData.get(month).add(income);

    }


    public void addExpense(Entry expense) {

        String month = expense.getMonth();

        if (!expenseData.containsKey(month)) {

            expenseData.put(month, new ArrayList<>());

        }

        expenseData.get(month).add(expense);

    }


    public double calculateTotalForCategory(String category, String month, Map<String, List<Entry>> data) {

        double total = 0;

        List<Entry> entries = data.get(month);

        if (entries != null) {

            for (Entry entry : entries) {

                if (entry.getCategory().equals(category)) {

                    total += entry.getAmount();

                }

            }

        }

        return total;

    }


    public double calculateNetBalance(String month) {

        double totalIncome = 0;

        List<Entry> incomeEntries = incomeData.get(month);

        if (incomeEntries != null) {

            for (Entry entry : incomeEntries) {

                totalIncome += entry.getAmount();

            }

        }


        double totalExpenses = 0;

        List<Entry> expenseEntries = expenseData.get(month);

        if (expenseEntries != null) {

            for (Entry entry : expenseEntries) {

                totalExpenses += entry.getAmount();

            }

        }


        return totalIncome - totalExpenses;

    }


    public void saveDataToFile(String filename) throws IOException {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {

            oos.writeObject(incomeData);

            oos.writeObject(expenseData);

        }

    }


    public void loadDataFromFile(String filename) throws IOException, ClassNotFoundException {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

            incomeData = (Map<String, List<Entry>>) ois.readObject();

            expenseData = (Map<String, List<Entry>>) ois.readObject();

        }

    }


    public void displayCategoryTotals(String month) {
        System.out.println("Category-wise totals for " + month + ":");

        System.out.println("Income:");
        Map<String, Double> incomeTotals = new HashMap<>();
        List<Entry> incomeEntries = incomeData.get(month);
        double totalIncome = 0;
        if (incomeEntries != null) {
            for (Entry entry : incomeEntries) {
                String category = entry.getCategory();
                double amount = entry.getAmount();
                totalIncome += amount; // Add to total income
                incomeTotals.put(category, incomeTotals.getOrDefault(category, 0.0) + amount);
            }
        }
        for (Map.Entry<String, Double> entry : incomeTotals.entrySet()) {
            System.out.println(" - " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Total Income: " + totalIncome); // Display total income

        System.out.println("Expenses:");
        Map<String, Double> expenseTotals = new HashMap<>();
        List<Entry> expenseEntries = expenseData.get(month);
        double totalExpenses = 0;
        if (expenseEntries != null) {
            for (Entry entry : expenseEntries) {
                String category = entry.getCategory();
                double amount = entry.getAmount();
                totalExpenses += amount; // Add to total expenses
                expenseTotals.put(category, expenseTotals.getOrDefault(category, 0.0) + amount);
            }
        }
        for (Map.Entry<String, Double> entry : expenseTotals.entrySet()) {
            System.out.println(" - " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Total Expenses: " + totalExpenses); // Display total expenses
    }


    public void printData() {
        System.out.println("Income Data:");
        for (Map.Entry<String, List<Entry>> monthEntry : incomeData.entrySet()) {
            System.out.println("Month: " + monthEntry.getKey());
            for (Entry entry : monthEntry.getValue()) {
                System.out.println("  Category: " + entry.getCategory() + ", Amount: " + entry.getAmount());
            }
        }

        System.out.println("Expense Data:");
        for (Map.Entry<String, List<Entry>> monthEntry : expenseData.entrySet()) {
            System.out.println("Month: " + monthEntry.getKey());
            for (Entry entry : monthEntry.getValue()) {
                System.out.println("  Category: " + entry.getCategory() + ", Amount: " + entry.getAmount());
            }
        }
    }


}
