package generics.company;

import generics.company.employees.Employee;
import generics.company.employees.ITSpecialist;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public <T extends Employee> void addDepartment(Department<T> department) {
        departments.add(department);
        List<T> employeeList = department.getEmployees();
        giveRise(employeeList);
        this.employees.addAll(employeeList);
    }

    private void giveRise(List<? extends Employee> employeeList) {
        for (Employee employee : employeeList) {
            float rise = employee.getSalary() * 0.2f;
            float newSalary = employee.getSalary() + rise;
            employee.setSalary(newSalary);
        }
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void print(List<?> list){
        System.out.println("Size " + list.size());
        System.out.println(list);
    }

    public void addToItEmployees(List<? super ITSpecialist> list){
        list.add(new ITSpecialist("Joe",3500.00f));
    }

    @Override
    public String toString() {
        return "Company{" +
                "departments=" + departments +
                ",\n employees=" + employees +
                '}';
    }
}
