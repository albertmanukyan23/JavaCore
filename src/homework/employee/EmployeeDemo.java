package homework.employee;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage es = new EmployeeStorage();

    public static void addDispatcher() {
        System.out.println("Please input Employee's name ");
        String name = scanner.nextLine();
        System.out.println("Please input Employee's surname ");
        String surname = scanner.nextLine();
        System.out.println("Please input Employee's ID (for every employee it must be unrepeatable ,start with the letter A and consist of 4 symbols)");
        String id = scanner.nextLine();
        while (!id.startsWith("A") || id.length() != 4 || es.searchByID(id) != null) {
            System.err.println("Please , enter the id correctly");
            id = scanner.nextLine();
        }
        System.out.println("Please input Employee's salary ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input the name of the company ");
        String company = scanner.nextLine();
        System.out.println("Please input Employee's position ");
        String position = scanner.nextLine();
        Employee newEmployee = new Employee(name, surname, id, salary, company, position);
        es.add(newEmployee);
        System.out.println("registration succeeded");

    }

    public static void idDispatcher() {
        System.out.println("Please Input Employee's ID");
        String employeeId = scanner.nextLine();
        Employee emp = es.searchByID(employeeId);
        if (emp == null) {
            System.err.println("There is not employee in such ID");
            return;
        }
        System.out.println(emp);
    }

    public static void nameDispatcher() {
        System.out.println("For seeing information about the employees Please input company's name");
        String companyName = scanner.nextLine();
        Employee[] colleagues = es.searchByCompanyName(companyName);
        boolean employeeExist = false;
        for (int i = 0; i < colleagues.length; i++) {
            if (colleagues[i] != null) {
                employeeExist = true;
                System.out.println(colleagues[i]);
            }
        }
        if (!employeeExist) {
            System.err.println("There are no employees in this company");
        }
    }

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Please input 0 for exit ");
            System.out.println("Please input 1 for add employee ");
            System.out.println("Please input 2 for print all employees ");
            System.out.println("Please input 3 for  search employee by employee ID ");
            System.out.println("Please input 4 for search employee by company name ");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRunning = false;
                    break;
                case "1":
                    addDispatcher();
                    break;
                case "2":
                    es.print();
                    break;
                case "3":
                    idDispatcher();
                    break;
                case "4":
                    nameDispatcher();
                    break;
                default:
                    System.err.println("Wrong command, Please try again");
            }
        }
    }
}
