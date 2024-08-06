import java.io.*;
import java.util.*;


public class Entry implements Serializable {

    private String category;

    private double amount;

    private String month;



    public Entry(String category, double amount, String month) {

        this.category = category;

        this.amount = amount;

        this.month = month;

    }



    public String getCategory() {

        return category;

    }



    public double getAmount() {

        return amount;

    }



    public String getMonth() {

        return month;

    }

}
