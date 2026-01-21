package com.generics.mealplangenerator;


public class VegetarianMeal implements MealPlan {

    public String getPlanName() {
        return "Vegetarian";
    }

    public boolean isValid() {
        return true;
    }
}