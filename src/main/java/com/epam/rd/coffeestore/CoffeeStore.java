package com.epam.rd.coffeestore;

import static com.epam.rd.coffeestore.common.List.fill;
import com.epam.rd.coffeestore.common.Function;
import com.epam.rd.coffeestore.common.Tuple;
import com.epam.rd.coffeestore.common.List;

public class CoffeeStore {

    public static Tuple<Payment, Coffee> buyCoffee(CreditCard creditCard,
                                                   Function<Coffee,
                                                   Integer> compPrice) {
        Coffee coffee = new Coffee();
        Payment payment = new Payment(creditCard, compPrice.apply(coffee));
        return new Tuple<>(payment, coffee);
    }

    public static Tuple<List<Coffee>,
        Payment> buyCoffees(final int quantity,
                            final CreditCard cCard) {
        return new Tuple<>(fill(quantity, () -> new Coffee()),
                           new Payment(cCard,  Coffee.prices * quantity));
    }
}
