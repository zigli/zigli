package generics.company;

import generics.company.employees.Accountant;
import generics.company.employees.ITSpecialist;
import generics.company.employees.Manager;

public class CompanyMain {

    public static void main(String[] args) {

        Company company = new Company();

        Department<Accountant> accountingDep = new Department<>("Accounting",5);
        Department<Manager> managementDep = new Department<>("Management",2);
        Department<ITSpecialist> itGuysDep = new Department<>("It specialist",2);

        Accountant accountant = new Accountant("Alex", 1000.0f);
        ITSpecialist it = new ITSpecialist("James", 2000.0f);
        Manager manager = new Manager("Michael", 4000.0f);

        accountingDep.addEmployee(accountant);
        itGuysDep.addEmployee(it);
        managementDep.addEmployee(manager);

//        Department<String> dept = new Department<>("", 20);

        company.addDepartment(accountingDep);
        company.addDepartment(managementDep);
        company.addDepartment(itGuysDep);

        System.out.println(company);

        company.print(company.getDepartments());
        company.print(company.getEmployees());

        company.addToItEmployees(itGuysDep.getEmployees());
        company.addToItEmployees(company.getEmployees());
    }
}
