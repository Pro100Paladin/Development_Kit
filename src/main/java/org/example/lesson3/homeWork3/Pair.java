package org.example.lesson3.homeWork3;

public record Pair<T, U>(T first, U second) {

    @Override
    public String toString() {
        return "(" + first +
                ", " + second +
                ')';
    }
}

//public class Pair <T, U>{
//    private final T first;
//    private final U second;
//
//
//    public Pair(T first, U second) {
//        this.first = first;
//        this.second = second;
//    }
//
//    public T getFirst() {
//        return first;
//    }
//
//    public U getSecond() {
//        return second;
//    }
//
//    @Override
//    public String toString() {
//        return "(" + first +
//                ", " + second +
//                ')';
//    }