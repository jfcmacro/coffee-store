package com.epam.rd.coffeestore;

import com.epam.rd.coffeestore.common.Function;

public class CoffeeStore {

    public static Purchase buyCoffee(CreditCard creditCard,
                                     Function<Coffee,Integer> compPrice) {
        Coffee coffee = new Coffee();
        Payment payment = new Payment(creditCard, compPrice.apply(coffee));
        return new Purchase(coffee, payment);
    }
}
