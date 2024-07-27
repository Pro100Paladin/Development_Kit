package org.example.lesson4.homeWork4;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee {
   private int personnelNumber;
   private long phoneNumber;
   private String name;
   private int experience;

    public Employee(int personnelNumber, long phoneNumber, String name, int experience) {
        this.personnelNumber = personnelNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }



    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personnelNumber=" + personnelNumber +
                ", phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
