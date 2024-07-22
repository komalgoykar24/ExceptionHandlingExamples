package com.prime;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void isPrime(int num) throws NotPrimeException {
        if(num<=1)
            throw new NotPrimeException("Number is NOT PRIME");

        else
        {
            for(int i=2;i<num/2;i++)
            {
                if(num % i==0)
                    throw new NotPrimeException("Number is not PRIME");

            }
            System.out.println("Number is PRIME");
        }
    }

    public static void main(String[] args) throws NotPrimeException {
        try {
            isPrime(7);
        } catch (NotPrimeException e) {
            e.printStackTrace();
        }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



    }
}