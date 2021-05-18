package org.Marta;

import java.util.List;

public class Pizza {
    private final String name;
    private final boolean isVegetarian;
    private final List<Ingredients> ingredients;
    private final int kcal;

    public Pizza(String name, boolean isVegetarian, List<Ingredients> ingredients, int kcal) {
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.ingredients = ingredients;
        this.kcal = kcal;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public int getKcal() {
        return kcal;
    }

    @Override
    public String toString() {
        return "Pizza: " + name + ", isVegetarian: " + isVegetarian + ", ingredients: " + ingredients + ", kcal=" + kcal;
    }
}
