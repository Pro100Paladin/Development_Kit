package org.example.lesson3.homeWork3;

public class CompareArrays {
    public <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].getClass().equals(array2[i].getClass())) {
                return false;
            }
        }
        return true;
    }
}