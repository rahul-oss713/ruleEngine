package org.example.Rippling.Model;

public abstract class Expense {

  public int expense_id;
  public String trip_id;
  public ExpenseType expenseType;
  public String vendorName;
  public int amount;

  public Expense(int expense_id, String trip_id, ExpenseType expenseType, String vendorName, int amount) {
    this.expense_id = expense_id;
    this.trip_id = trip_id;
    this.expenseType = expenseType;
    this.vendorName = vendorName;
    this.amount = amount;
  }

  public abstract boolean verifyExpense();



}