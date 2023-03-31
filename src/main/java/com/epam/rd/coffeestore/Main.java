package com.epam.rd.coffeestore;

import com.epam.rd.coffeestore.common.Function;

public class Main {
    public static void main(String[] args) {
        Function<Coffee,Integer> noDiscount = (coffee) -> coffee.prices;

        Function<Coffee,Integer> discount = (coffee) -> coffee.prices / 3;

        CreditCard cc = new CreditCard();
        Purchase pNoDiscount = CoffeeStore.buyCoffee(cc, noDiscount);
        Purchase pDiscount = CoffeeStore.buyCoffee(cc, discount);
    }
}
