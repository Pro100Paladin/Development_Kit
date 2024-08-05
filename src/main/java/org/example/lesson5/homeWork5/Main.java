package org.example.lesson5.homeWork5;

public class Main {
    public static void main(String[] args) {
        Philosopher philosopher1 = new Philosopher("Аристотель");
        Philosopher philosopher2 = new Philosopher("Платон");
        Philosopher philosopher3 = new Philosopher("Пифагор");
        Philosopher philosopher4 = new Philosopher("Евклид");
        Philosopher philosopher5 = new Philosopher("Вассерман");

        philosopher1.setPhilosopher(philosopher2);
        philosopher2.setPhilosopher(philosopher3);
        philosopher3.setPhilosopher(philosopher4);
        philosopher4.setPhilosopher(philosopher5);
        philosopher5.setPhilosopher(philosopher1);


        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();
    }
}
