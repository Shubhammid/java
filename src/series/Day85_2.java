package series;

import java.util.*;

public class Day85_2 {

    public static void findTopKWords(String[] tweets, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String tweet : tweets) {

            String[] words = tweet.toLowerCase().split(" ");

            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        PriorityQueue<Map.Entry<String, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(map.entrySet());

        System.out.println("Top " + k + " Tweet Words:");

        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            Map.Entry<String, Integer> entry = maxHeap.poll();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        String[] tweets = {
                "java is great",
                "i love java",
                "java java coding",
                "coding is fun",
                "love coding in java"
        };

        int k = 3;

        findTopKWords(tweets, k);
    }
}