package series;

import java.util.*;

public class Day82_2 {

    static class Book {
        String name;
        int cost;

        Book(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Java", 500));
        books.add(new Book("DSA", 400));
        books.add(new Book("OS", 500));
        books.add(new Book("DBMS", 300));
        books.add(new Book("CN", 400));
        books.add(new Book("AI", 500));

        HashMap<Integer, Integer> costFrequency = new HashMap<>();

        for (Book b : books) {
            costFrequency.put(b.cost,
                    costFrequency.getOrDefault(b.cost, 0) + 1);
        }

        int popularCost = -1;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : costFrequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                popularCost = entry.getKey();
            }
        }

        System.out.println("Most Popular Cost: " + popularCost);
        System.out.println("Frequency: " + maxCount);

        System.out.println("Books with most popular cost:");
        for (Book b : books) {
            if (b.cost == popularCost) {
                System.out.println(b.name + " - " + b.cost);
            }
        }
    }
}