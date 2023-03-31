package com.epam.rd.coffeestore;

import com.epam.rd.coffeestore.common.Function;

public class Main {
    public static void main(String[] args) {
        Function<Coffee,Integer> noDiscount = new Function<>() {
                public Integer apply(Coffee coffee) {
                    return coffee.prices;
                }
            };

        Function<Coffee,Integer> discount = new Function<>() {
                public Integer apply(Coffee coffee) {
                    return coffee.prices / 3;
                }
            };

        CreditCard cc = new CreditCard();
        Purchase pNoDiscount = CoffeeStore.buyCoffee(cc, noDiscount);
        Purchase pDiscount = CoffeeStore.buyCoffee(cc, discount);
    }
}
