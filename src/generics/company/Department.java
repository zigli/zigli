package generics.company;

import generics.company.employees.Employee;

import java.util.ArrayList;
import java.util.List;

public class Department<T extends Employee> {

    private String name;
    private int employeeNumber;
    private List<T> employees = new ArrayList<>();

    public Department(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public boolean addEmployee(T employee){
        return employees.add(employee);
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public List<T> getEmployees() {
        return employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "\nDepartment{" +
                "name='" + name + '\'' +
                ", employeeNumber=" + employeeNumber +
//                ", employees=" + employees +
                '}';
    }
}
