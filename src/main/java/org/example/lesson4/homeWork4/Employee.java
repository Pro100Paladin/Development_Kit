package org.example.lesson4.homeWork4;

public record Employee(int personnelNumber, long phoneNumber, String name, int experience) {

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

//public class Employee {
//    private final int personnelNumber;
//    private final long phoneNumber;
//    private final String name;
//    private final int experience;
//
//    public Employee(int personnelNumber, long phoneNumber, String name, int experience) {
//        this.personnelNumber = personnelNumber;
//        this.phoneNumber = phoneNumber;
//        this.name = name;
//        this.experience = experience;
//    }
//
//    public int getPersonnelNumber() {
//        return personnelNumber;
//    }
//
//    public long getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getExperience() {
//        return experience;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "personnelNumber=" + personnelNumber +
//                ", phoneNumber=" + phoneNumber +
//                ", name='" + name + '\'' +
//                ", experience=" + experience +
//                '}';
//    }
