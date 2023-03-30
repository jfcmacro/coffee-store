package com.epam.rd.coffeestore;

public class CoffeeStore {

    public static Purchase buyCoffee(CreditCard creditCard) {
        Coffee coffee = new Coffee();
        Payment payment = new Payment(creditCard, coffee.prices);
        return new Purchase(coffee, payment);
    }
}
