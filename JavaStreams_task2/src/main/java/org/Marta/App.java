package org.Marta;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Pizza> pizzas = Arrays.asList(
                new Pizza("Margherita", true, Arrays.asList(Ingredients.MOZZARELLA), 1123),
                new Pizza("Prosciutto", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.HAM), 1311),
                new Pizza("Salame", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.SALAMI), 1356),
                new Pizza("Capri", true, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.MUSHROOMS), 1212),
                new Pizza("Italiana", true, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.TOMATO), 1250),
                new Pizza("Capriciossa", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.HAM, Ingredients.MUSHROOMS), 1561),
                new Pizza("Quattro", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.HAM, Ingredients.SALAMI, Ingredients.MUSHROOMS), 1690),
                new Pizza("Vegetariana", true, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.TOMATO, Ingredients.MUSHROOMS, Ingredients.ONION, Ingredients.CELERY), 1350),
                new Pizza("Picanteria", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.SALAMI, Ingredients.PEPPER), 1570),
                new Pizza("Master Chef", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.PEPPER, Ingredients.HAM, Ingredients.CELERY, Ingredients.ONION, Ingredients.MUSHROOMS, Ingredients.TOMATO), 1750)
        );

        PizzaChecker pizzaChecker = new PizzaChecker(pizzas);

        System.out.println("Veg Pizzas: ");
        pizzaChecker.printVegPizzas();

        System.out.println("\n" + "Pizzas with allergens: ");
        pizzaChecker.printPizzasWithAllergens();

        System.out.println("\n" + "Is there at least one vegetarian pizza containing tomato and pepper?");
        System.out.println(pizzaChecker.isAnyVegPizzaWithTomatoAndPepper());

        System.out.println("\n" + "Do all pizzas contain mozzarella?");
        System.out.println(pizzaChecker.isAllPizzasContainMozzarella());

        System.out.println("\n" + "The most caloric pizza is: ");
        System.out.println(pizzaChecker.findHighestCaloriePizza());

        System.out.println("\n" + "The least caloric pizza is: ");
        System.out.println(pizzaChecker.findLowestCaloriePizza());
    }
}
