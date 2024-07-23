package org.example.lesson3.homeWork3;


public class Main {

    public static void main(String[] args) {

        System.out.println("""
                \u001b[33m
                Задание 1
                ---------------------------------------""");

        System.out.println(Calculator.sum(5, 3.1f));
        System.out.println(Calculator.multiply(5, 3.1f));
        System.out.println(Calculator.divide(5, 3.1f));
        System.out.println(Calculator.divide(5, 0));
        System.out.println(Calculator.subtract(5, 3.1f));
        System.out.println("""
                \u001b[34m
                Задание 2
                ---------------------------------------""");

        CompareArrays compareArrays = new CompareArrays();

        Integer[] array01 = {1, 2, 3};
        Integer[] array02 = {1, 2, 3};
        Integer[] array03 = {4, 5, 6};
        Double[] array04 = {4.0, 5.0, 6.0};
        Object[] array05 = {4.0, 5.0, 6.0};

        String[] array11 = {"a", "b", "c"};
        String[] array12 = {"a", "b", "c"};
        String[] array13 = {"d", "e", "f"};
        Object[] array14 = {"d", "e", "f"};

        System.out.println(compareArrays.compareArrays(array01, array02)); // одинаковые значения Integer
        System.out.println(compareArrays.compareArrays(array01, array03)); // разные значения Integer
        System.out.println(compareArrays.compareArrays(array03, array04)); // разные типы Integer/Double
        System.out.println(compareArrays.compareArrays(array04, array05)); // разные типы Double/родитель Object
        System.out.println(compareArrays.compareArrays(array11, array12)); // одинаковые значения String
        System.out.println(compareArrays.compareArrays(array11, array13)); // разные значения String
        System.out.println(compareArrays.compareArrays(array01, array13)); // разные типы Integer/String
        System.out.println(compareArrays.compareArrays(array13, array14)); // разные типы String/родитель Object


        System.out.println("""
                \u001b[35m
                Задание 3
                ---------------------------------------""");

        Pair<Integer, String> firstPair = new Pair<>(1, "One");
        System.out.println("Первое значение: " + firstPair.first());
        System.out.println("Второе значение: " + firstPair.second());
        System.out.println("Первая пара: " + firstPair + "\n");

        Pair<Double, Boolean> secondPair = new Pair<>(2.5, true);
        System.out.println("Первое значение: " + secondPair.first());
        System.out.println("Второе значение: " + secondPair.second());
        System.out.println("Вторая пара: " + secondPair + "\n");

        Pair<String, Float> thirdPair = new Pair<>("third", 3.3f);
        System.out.println("Первое значение: " + thirdPair.first());
        System.out.println("Второе значение: " + firstPair.second());
        System.out.println("третья пара: " + thirdPair);
        System.out.println("_____________________________________");
    }
}
