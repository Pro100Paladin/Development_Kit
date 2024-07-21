package org.example.lesson2.homeWork2.DB;

public interface Repository<T> {
    void save(T text);
    T load();
}