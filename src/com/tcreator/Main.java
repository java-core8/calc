package com.tcreator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1,3);
        int b = calc.minus.apply(3,1);
        int c = calc.devide.apply(a, b); // не работает потому как деление на ноль

        calc.println.accept(c);
    }
}
