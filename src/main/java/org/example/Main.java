package org.example;

// Main.java

public class Main {
    public static void main(String[] args) {


        Pair<String, Integer> agePair = new Pair<>("Age", 25);
        System.out.println("Pair 1: " + agePair);


        Pair<Integer, String> errorPair = new Pair<>(404, "Not Found");
        System.out.println("Pair 2: " + errorPair);


        Pair<String, String> statusPair = Pair.create("Status", "Active");
        System.out.println("Pair 3: " + statusPair);


        Pair<String, Integer> anotherAgePair = new Pair<>("Age", 25);
        System.out.println("Are Pair 1 and Pair 4 equal? " + agePair.equals(anotherAgePair));
    }
}
