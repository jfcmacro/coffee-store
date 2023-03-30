package com.epam.rd.coffeestore;

public class Purchase {
    public Coffee coffee;
    public Payment payment;

    public Purchase(Coffee coffee, Payment payment) {
        this.coffee = coffee;
        this.payment = payment;
    }
}
