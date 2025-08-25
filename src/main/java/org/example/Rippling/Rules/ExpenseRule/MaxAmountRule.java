package org.example.Rippling.Rules.ExpenseRule;

import org.example.Rippling.Model.Expense;

public class MaxAmountRule implements ExpenseRule {

    int amount;
   public MaxAmountRule(int amount){
        this.amount=amount;
    }

    @Override
    public boolean validExpense(Expense expense) {
            if(expense.amount > amount){
                System.out.println("REJECTED: ["+expense.expenseType+" expense exceeds $"+ amount+"]");
                return false;
            }
            return true;
    }
}
