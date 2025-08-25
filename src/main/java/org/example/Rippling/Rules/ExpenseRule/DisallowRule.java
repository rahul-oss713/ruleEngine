package org.example.Rippling.Rules.ExpenseRule;

import org.example.Rippling.Model.Expense;

public class DisallowRule implements ExpenseRule {

    @Override
    public boolean validExpense(Expense expense) {
            System.out.println("REJECTED: [" + expense.expenseType + " expenses not allowed]");
            return false;
    }
}
