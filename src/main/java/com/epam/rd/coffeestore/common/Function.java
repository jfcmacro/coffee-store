package com.epam.rd.coffeestore.common;

public interface Function<T, U> {
  U apply(T arg);
}
