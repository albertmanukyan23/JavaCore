package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmployeeStorage es = new EmployeeStorage();
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
                    System.out.println("Please input Employee's name ");
                    String name = scanner.nextLine();
                    System.out.println("Please input Employee's surname ");
                    String surname = scanner.nextLine();
                    System.out.println("Please input Employee's ID (for every employee it must be unrepeatable ,start with the letter A and consist of 4 symbols)");
                    String id = scanner.nextLine();
                    while (!id.startsWith("A") || id.length() != 4 || !es.idIsUnique(id)) {
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
                    break;
                case "2":
                    es.print();
                    break;
                case "3":
                    System.out.println("Please Input Employee's ID");
                    String employeeId = scanner.nextLine();
                    es.searchByID(employeeId);
                    break;
                case "4":
                    System.out.println("For seeing information about the employees Please input company's name");
                    String companyName = scanner.nextLine();
                    es.searchByCompanyName(companyName);
                    break;
                default:
                    System.err.println("Wrong command, Please try again");
            }
        }
    }
}
