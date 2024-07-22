package com.age;
public class Main {
   static void validateAge(int age) throws InvalidAgeException
    {
        if(age>0 && age<120)
            System.out.println("YOU ARE ELIGIBLE..");
        else
            throw new InvalidAgeException("Yor are not ELIGIBLE");

    }

    public static void main(String[] args) throws InvalidAgeException {
       validateAge(16);
        validateAge(150);
    }




}
