package com.epam.rd.coffeestore;

import com.epam.rd.coffeestore.common.Function;
import com.epam.rd.coffeestore.common.Tuple;
import com.epam.rd.coffeestore.common.List;

public class Main {
    public static void main(String[] args) {
        Function<Coffee,Integer> noDiscount = (coffee) -> coffee.prices;

        Function<Coffee,Integer> discount = (coffee) -> coffee.prices / 3;

        CreditCard cc = new CreditCard();
        Tuple<Payment,Coffee> tNoDiscount = CoffeeStore.buyCoffee(cc,
                                                                  noDiscount);
        Tuple<Payment,Coffee> tDiscount = CoffeeStore.buyCoffee(cc,
                                                                discount);

        Tuple<List<Coffee>,
            Payment> p3 = CoffeeStore.buyCoffees(3, cc);
        Tuple<List<Coffee>,
            Payment> p4d = CoffeeStore.buyCoffees(4, cc);
    }
}
