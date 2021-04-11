package com.tcreator;

import java.util.function.*;

public class Calculator {
  static public final Supplier<Calculator> instance = Calculator::new;

  BinaryOperator<Integer> plus = (x, y) -> x + y;
  BinaryOperator<Integer> minus = (x, y) -> x - y;
  BinaryOperator<Integer> multiply = (x, y) -> x * y;
  BinaryOperator<Integer> devide = (x, y) -> (x == 0 || y == 0) ? 0 : x / y; // если один из операндов равен нулю, возвращаем 0

  UnaryOperator<Integer> pow = x -> x * x;
  UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

  Predicate<Integer> isPositive = x -> x > 0;

  Consumer<Integer> println = System.out::println;

  public static Supplier get() {
    return instance;
  }
}
