package org.example.Rippling.Rules.TripRule;

import org.example.Rippling.Model.Expense;

import java.util.List;

public interface TripRule {

    boolean validExpense(List<Expense> expense);
}
