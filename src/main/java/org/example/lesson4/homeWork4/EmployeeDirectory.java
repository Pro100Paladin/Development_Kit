package org.example.lesson4.homeWork4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDirectory {

    private final List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "EmployeeDirectory{" +
                "employees=" + employees +
                '}';
    }

    public void print() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public void printPhone() {
        for (Employee employee : employees) {
            System.out.println(employee.getPhoneNumber());
        }
    }


    public List<Employee> searchForAnEmployeeByExperience(int experience) { // метод, который ищет сотрудника по стажу (может быть список)
        return employees.stream().filter(n -> n.getExperience() == experience).toList();
    }


    public List<Employee> phoneNumberByName(String name) { // метод, который возвращает номер телефона сотрудника по имени (может быть список)
        return employees.stream().filter(n -> n.getName().equals(name)).collect(Collectors.toList());
    }


    public List<Employee> searchForAnEmployeeByPersonnelNumber(int personnelNumber) { // метод, который ищет сотрудника по табельному номеру
        return employees.stream().filter(n -> n.getPersonnelNumber() == personnelNumber).toList();
    }

    public void addingANewEmployee(int personnelNumber, long phoneNumber, String name, int experience) { // метод добавления нового сотрудника в справочник
        employees.add(new Employee(personnelNumber, phoneNumber, name, experience));

    }
}

