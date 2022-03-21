package com.company;

public class SpecialCheckingAccount extends CheckingAccount {
    private double interest;
    private double minBal;


    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double ir, double mb){
        super(idNumber,startBal,cc);
        minBal=mb;
        interest=ir;
    }

    public void clearCheck(double amount)
    {
        if (amount<=super.currentBalance()) {
            decreaseBalance(amount );
        }
    }

    public double monthlyInterest(){
        if(minBal<this.currentBalance()){
            return (super.currentBalance()*(interest)/12);
        }
        return super.monthlyInterest();
    }




}
