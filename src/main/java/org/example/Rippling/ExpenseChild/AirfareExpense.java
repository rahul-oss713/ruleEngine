package org.example.Rippling.ExpenseChild;

import org.example.Rippling.Model.Expense;
import org.example.Rippling.Model.ExpenseType;
import org.example.Rippling.Rules.ExpenseRule.ExpenseRule;


import java.util.List;

public class AirfareExpense extends Expense  {

    public static List<ExpenseRule> ruleList;

    public AirfareExpense(int expense_id, String trip_id, String vendorName, int amount) {
        super(expense_id, trip_id,ExpenseType.AIRFARE,  vendorName, amount);
    }

    @Override
    public boolean verifyExpense() {
        for(ExpenseRule rule: ruleList){
            if(!rule.validExpense(this)){
                return false;
            }
        }
        System.out.println("APPROVED");
        return true;
    }
}
