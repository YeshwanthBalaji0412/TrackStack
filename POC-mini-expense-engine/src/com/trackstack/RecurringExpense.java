package com.trackstack;

public class RecurringExpense extends Expense {
    private int dayOfMonth;
    public RecurringExpense(double amount, Category category, String description, int dayOfMonth){
        super(amount, category, description);
        this.dayOfMonth = dayOfMonth;
    }
    @Override
    public void printReceipt() {
        System.out.println(amount + " on " + getDescription() + " - recurs on day " + dayOfMonth);
    }
}
