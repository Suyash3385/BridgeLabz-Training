package com.generics.mealplangenerator;


public class Main {
    public static void main(String[] args) {

        Meal<VegetarianMeal>vegMeal = MealGenerator.generateMeal(new VegetarianMeal());
        Meal<VeganMeal>veganMeal = MealGenerator.generateMeal(new VeganMeal());
        System.out.println("Meal Plans Generated ");
    }
}
