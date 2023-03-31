package com.epam.rd.coffeestore.common;

public interface Effect<T> {
  void apply(T t);
}
