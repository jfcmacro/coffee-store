package com.epam.rd.coffeestore;

public class CoffeeStore {

    public static Coffee buyCoffee(CreditCard creditCard) {
        Coffee coffee = new Coffee();
        creditCard.charge(coffee);
        return coffee;
    }
}
