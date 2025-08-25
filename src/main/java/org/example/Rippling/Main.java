package org.example.Rippling;

import org.example.Rippling.ExpenseChild.*;
import org.example.Rippling.Model.Expense;
import org.example.Rippling.Rules.ExpenseRule.DisallowRule;
import org.example.Rippling.Rules.ExpenseRule.MaxAmountRule;
import org.example.Rippling.Rules.TripRule.MealExpenseRule;
import org.example.Rippling.Rules.TripRule.TotalAmountRule;
import org.example.Rippling.Rules.TripRule.TripRule;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List 1
        List<Expense> expenses1 = Arrays.asList(
                new RestaurantExpense(1, "trip1" ,"Outback Roadhouse", 80),
                new SuppliesExpense(2, "trip1", "Staples", 120),
                new AirfareExpense(3, "trip1", "Delta Airlines", 199),
                new HotelExpense(4, "trip1", "Marriott", 260),
                new RestaurantExpense(5, "trip1", "Chipotle", 70)
        );

        AirfareExpense.ruleList = List.of(new DisallowRule(),new MaxAmountRule(140));

        RestaurantExpense.ruleList = List.of(new MaxAmountRule(75));

        EntertainmentExpense.ruleList = List.of(new MaxAmountRule(290));

        HotelExpense.ruleList = List.of(new MaxAmountRule(100));

        SuppliesExpense.ruleList = List.of(new MaxAmountRule(200));

        System.out.println("Expense Violations:");

        for(Expense expense : expenses1){
               expense.verifyExpense();
        }

        List<TripRule> tripRules = List.of(new MealExpenseRule(1000), new TotalAmountRule(2000));
        System.out.println();
        System.out.println("Trip Violations:");
        for(TripRule tripRule : tripRules){
            tripRule.validExpense(expenses1);
        }

    }
}




//
//
//
//
//
//// List 2
//List<Expense> expenses2 = Arrays.asList(
//        new EntertainmentExpense(6, "trip2", ExpenseType.ENTERTAINMENT, "AMC Theaters", 40),
//        new HotelExpense(7, "trip2", ExpenseType.HOTEL, "Hilton", 300),
//        new SuppliesExpense(8, "trip2", ExpenseType.SUPPLIES, "Office Depot", 95),
//        new RestaurantExpense(9, "trip2", ExpenseType.RESTAURANT, "Olive Garden", 110),
//        new AirfareExpense(10, "trip2", ExpenseType.AIRFARE, "United Airlines", 220)
//);
//
//// List 3
//List<Expense> expenses3 = Arrays.asList(
//        new RestaurantExpense(11, "trip3", ExpenseType.RESTAURANT, "Pizza Hut", 60),
//        new HotelExpense(12, "trip3", ExpenseType.HOTEL, "Hyatt", 280),
//        new SuppliesExpense(13, "trip3", ExpenseType.SUPPLIES, "Best Buy", 150),
//        new AirfareExpense(14, "trip3", ExpenseType.AIRFARE, "American Airlines", 210),
//        new EntertainmentExpense(15, "trip3", ExpenseType.ENTERTAINMENT, "Regal Cinemas", 55)
//);
//
//// List 4
//List<Expense> expenses4 = Arrays.asList(
//        new RestaurantExpense(16, "trip4", ExpenseType.RESTAURANT, "Burger King", 45),
//        new HotelExpense(17, "trip4", ExpenseType.HOTEL, "Sheraton", 310),
//        new SuppliesExpense(18, "trip4", ExpenseType.SUPPLIES, "Walmart", 80),
//        new AirfareExpense(19, "trip4", ExpenseType.AIRFARE, "Alaska Airlines", 190),
//        new EntertainmentExpense(20, "trip4", ExpenseType.ENTERTAINMENT, "IMAX", 70)
//);
//
//// List 5
//List<Expense> expenses5 = Arrays.asList(
//        new RestaurantExpense(21, "trip5", ExpenseType.RESTAURANT, "Domino's", 55),
//        new HotelExpense(22, "trip5", ExpenseType.HOTEL, "Holiday Inn", 275),
//        new SuppliesExpense(23, "trip5", ExpenseType.SUPPLIES, "Target", 130),
//        new AirfareExpense(24, "trip5", ExpenseType.AIRFARE, "Spirit Airlines", 150),
//        new EntertainmentExpense(25, "trip5", ExpenseType.ENTERTAINMENT, "Cinemark", 65)
//);
//
//// List 6
//List<Expense> expenses6 = Arrays.asList(
//        new RestaurantExpense(26, "trip6", ExpenseType.RESTAURANT, "KFC", 50),
//        new HotelExpense(27, "trip6", ExpenseType.HOTEL, "Ritz Carlton", 400),
//        new SuppliesExpense(28, "trip6", ExpenseType.SUPPLIES, "Home Depot", 200),
//        new AirfareExpense(29, "trip6", ExpenseType.AIRFARE, "JetBlue", 175),
//        new EntertainmentExpense(30, "trip6", ExpenseType.ENTERTAINMENT, "Broadway Theater", 120)
//);
