package com.generics.mealplangenerator;
  

public class MealGenerator {

    public static <T extends MealPlan> Meal<T> generateMeal(T plan) {

        if (!plan.isValid()) {
            throw new IllegalArgumentException("Invalid meal plan");
        }
        System.out.println("Generating "+ plan.getPlanName() );
        return new Meal<>(plan);
    }
}
