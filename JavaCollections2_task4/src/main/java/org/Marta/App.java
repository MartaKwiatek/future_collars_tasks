package org.Marta;

public class App {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "Marta");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
