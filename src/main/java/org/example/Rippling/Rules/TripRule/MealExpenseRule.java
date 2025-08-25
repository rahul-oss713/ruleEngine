package org.example.Rippling.Rules.TripRule;

import org.example.Rippling.Model.Expense;
import org.example.Rippling.Model.ExpenseType;

import java.util.List;

public class MealExpenseRule implements TripRule{

    int amount;
    public MealExpenseRule(int amount){
        this.amount=amount;
    }
    @Override
    public boolean validExpense(List<Expense> expenses) {
       double mealSum =0;
        for(Expense exp: expenses){
            if(exp.expenseType== ExpenseType.RESTAURANT)
                mealSum+= exp.amount;
        }
        System.out.println("[Total meal expenses " + mealSum + " exceed " + amount + "? " + (mealSum > amount ? "Yes, so Not ok" : "No, so OK"));
        return mealSum <= amount;
    }
}
