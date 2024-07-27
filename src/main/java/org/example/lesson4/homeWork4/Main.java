package org.example.lesson4.homeWork4;

import java.util.Scanner;

import static org.example.lesson4.homeWork4.EmployeeDB.getEmployeeDirectory;

public class Main {

    public static void main(String[] args) {


        EmployeeDirectory employeeDirectory = getEmployeeDirectory();


        System.out.println("Введите стаж работника: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (Employee exp : employeeDirectory.searchForAnEmployeeByExperience(number)
        ) {
            System.out.println(exp.name());
        }
        System.out.println();


        System.out.println("Введите имя работника: ");
        Scanner scannerName = new Scanner(System.in);
        String name = scannerName.nextLine();
        for (Employee phoneN : employeeDirectory.phoneNumberByName(name)
        ) {
            System.out.println(phoneN.phoneNumber());
        }
        System.out.println();


        System.out.println(employeeDirectory.searchForAnEmployeeByPersonnelNumber(6).getFirst().name());


    }
}
