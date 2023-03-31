package com.epam.rd.coffeestore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CoffeestoreTest {
    @Test
    public void testByCoffees() {
        CreditCard creditCard = new CreditCard();
        Tuple<List<Coffee>,
            Payment> purchase = CoffeeStore.buyCoffees(5,
                                                       creditCard);
        assertEquals(Coffee.price * 5, purchase._2.amount);
        assertEquals(creditCard, purchase._2.creditCard);
    }
}
