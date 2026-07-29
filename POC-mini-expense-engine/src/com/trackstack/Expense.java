package com.trackstack;

public class Expense extends Transaction implements Payable{
    private Category category;
    private String description;
    public Expense(double amount, Category category, String description){
        super(amount);
        this.category = category;
        this.description = description;
    }
    @Override
    public void process(){
        System.out.println("Processing expense: " + description);
    }

    @Override
    public void printReceipt(){
        System.out.println(amount + " spent on " + category+ " (" + description + ")");
    }
    @Override
    public void pay() {
        System.out.println("Paid" + amount  + " for " + description);
    }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description;}
}
