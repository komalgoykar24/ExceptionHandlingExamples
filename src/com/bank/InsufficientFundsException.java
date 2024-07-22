package com.bank;
public class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg)
    {
        super(msg);
    }
}
