package com.trackstack;

public class Main {
    public static void main(String[] args) {
        Transaction[] all = {
                new Expense(50, Category.FOOD, "groceries"),
                new RecurringExpense(1200, Category.RENT, "apartment", 1)
        };
        for(Transaction t : all) {
            t.printReceipt();
            t.process();
        }
        System.out.println("Total transactions created: " + Transaction.getCount());
        Expense e = new Expense(30, Category.OTHER, "original");
        mutate(e);
        System.out.println("After mutate:   " + e.getDescription());
        reassign(e);
        System.out.println("After reassign:  " + e.getDescription());
    }
    static void mutate(Expense e){
        e.setDescription("changed");
    }
    static void reassign(Expense e){
        e = new Expense(1, Category.OTHER, "ghost");
    }
}
