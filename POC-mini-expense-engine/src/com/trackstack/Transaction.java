package com.trackstack;

import java.net.SocketOption;

public abstract class Transaction {
    protected double amount;
    private static int count = 0;

    public Transaction(double amount){
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.amount = amount;
        count ++;

    }
    public abstract void process();
    public void printReceipt(){
        System.out.println("Transaction of " + amount);
    }
    public double getAmount() {
        return amount;
    }
    public static int getCount() {
        return count;
    }

    public void print() {
    }
}
