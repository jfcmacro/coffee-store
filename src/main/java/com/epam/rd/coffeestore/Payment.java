package com.epam.rd.coffeestore;

public class Payment {

    public final CreditCard creditCard;
    public final int amount;

    public Payment(CreditCard creditCard, int amount) {
        this.creditCard = creditCard;
        this.amount = amount;
    }

    public Payment combine(Payment payment) {
        return new Payment(creditCard,
                           amount + payment.amount);
    }
}
