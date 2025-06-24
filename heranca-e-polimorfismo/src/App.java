
public class App {

    public static void main(String[] args) {
        // Employee employee = new Employee();
        Employee manager = new Manager();
        Salesman salesman = new Salesman();

        manager.setName("João");
        System.out.println("manager.getName " + manager.getName());
        printEmployee(manager);
        printEmployee(salesman);
    }

    public static void printEmployee(Employee employee) {

        // if (employee instanceof Manager manager) {
        // manager.setLogin("João");
        // manager.setPassword("123456");
        // System.out.println(employee.getClass());
        // System.out.println("((Manager)employee).getLogin " + manager.getLogin());
        // System.out.println("((Manager)employee).getPassword " +
        // manager.getPassword());
        // }

        switch (employee) {
            case Manager manager -> {
                manager.setLogin("João");
                manager.setPassword("123456");
                System.out.println(employee.getClass());
                System.out.println("((Manager)employee).getLogin " + manager.getLogin());
                System.out.println("((Manager)employee).getPassword " + manager.getPassword());
            }
            case Salesman salesman -> {
                salesman.setCode("123");
                salesman.setName("Joaninha");
                System.out.println(employee.getClass());
                System.out.println("((Manager)employee).getCode " + salesman.getCode());
                System.out.println("((Manager)employee).getName " + salesman.getName());

            }
        }

    }
}
