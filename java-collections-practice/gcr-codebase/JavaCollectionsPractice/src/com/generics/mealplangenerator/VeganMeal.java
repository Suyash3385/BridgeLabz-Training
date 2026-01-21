package com.generics.mealplangenerator;
public class VeganMeal implements MealPlan {

    public String getPlanName() {
        return "Vegan";
    }

    public boolean isValid() {
        return true;
    }
}
