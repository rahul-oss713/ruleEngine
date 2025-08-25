package org.example.Rippling.Rules.TripRule;

import org.example.Rippling.Model.Expense;

import java.util.List;

public class TotalAmountRule implements TripRule{

    int amount;
    public TotalAmountRule(int amount){
        this.amount=amount;
    }
    @Override
    public boolean validExpense(List<Expense> expenses) {
        double sum=0;

        for(Expense exp: expenses){
            sum+= exp.amount;
        }

        System.out.println("[Total trip expenses " + sum + " exceed " + amount + "? " + (sum > amount ? "Yes, so Not ok" : "No, so OK"));
        return sum <= amount;
    }
}
