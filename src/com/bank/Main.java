package com.bank;

import java.util.Base64;

public class Main
{
    private  static double balance=5000.78;
    public static void withdrae(double amount) throws InsufficientFundsException {


        if(amount>balance)
            throw new InsufficientFundsException("Checked Your balance Once..");
        else
            balance=balance-amount;
        System.out.println("Amount ="+amount+"\n "+" Balance ="+ balance);
    }
    public static void main(String[] args) throws InsufficientFundsException
    {

        withdrae(100000.78);


}
    }
