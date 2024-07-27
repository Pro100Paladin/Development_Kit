package org.example.lesson4.homeWork4;

public class EmployeeDB {

    static EmployeeDirectory getEmployeeDirectory() {
        Employee employee1 = new Employee(1, 89215555555L, "Евгений", 10);
        Employee employee2 = new Employee(2, 89216666666L, "Александр", 1);
        Employee employee3 = new Employee(3, 89217777777L, "Егор", 20);
        Employee employee4 = new Employee(4, 89218888888L, "Екатерина", 5);
        Employee employee5 = new Employee(5, 89218999999L, "Оля", 3);
        Employee employee6 = new Employee(6, 89211111111L, "Надежда", 10);
        Employee employee7 = new Employee(7, 89222222222L, "Оля", 10);


        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.add(employee1);
        employeeDirectory.add(employee2);
        employeeDirectory.add(employee3);
        employeeDirectory.add(employee4);
        employeeDirectory.add(employee5);
        employeeDirectory.add(employee6);
        employeeDirectory.add(employee7);
        return employeeDirectory;
    }
}
