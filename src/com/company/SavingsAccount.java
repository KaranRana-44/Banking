package com.company;

public class SavingsAccount extends Account {

    private double interest;

    public SavingsAccount(int idNumber, double startBal, double ir){
        super(idNumber,startBal);
        interest=ir;
    }

    public void withdraw(double amount){
        if (amount<=super.currentBalance()){
        decreaseBalance(amount);}
    }

    public double monthlyInterest(){
        return (super.currentBalance()*(interest)/12);
    }

}
