package org.example.lesson3.homeWork3;

/**
 * 1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
 * над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
 */
public class Calculator {

    public static <Num1 extends Number, Num2 extends Number> Double sum(Num1 num1, Num2 num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <Num1 extends Number, Num2 extends Number> Double multiply(Num1 num1, Num2 num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <Num1 extends Number, Num2 extends Number> Double divide(Num1 num1, Num2 num2) {
        if (num2.doubleValue() == 0){
            System.out.println("Делить на ноль нельзя!");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
    public static <Num1 extends Number, Num2 extends Number> Double subtract(Num1 num1, Num2 num2){
        return num1.doubleValue()- num2.doubleValue();
    }

}
