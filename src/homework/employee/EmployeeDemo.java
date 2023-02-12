package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeStorage es = new EmployeeStorage();

    private static void addController() {
        System.out.println("Please input Employee's name, surname, id, salary, company, position with commas");
        System.out.println("For every employee ID must be unrepeatable ,start with the letter A and consist of 4 symbols");
        String[] data = scanner.nextLine().split(",");
        if (es.getByEmployeeId(data[2]) != null) {
            System.err.println("ID already exists. Please enter a unique ID.");
        } else if (!data[2].startsWith("A") || data[2].length() != 4) {
            System.err.println("Please enter a valid ID");
        } else {
            Employee newEmployee = new Employee(data[0], data[1], data[2], Double.parseDouble(data[3]), data[4], data[5]);
            es.add(newEmployee);
            newEmployee.setActive(true);
            System.out.println("registration succeeded");
        }
    }

    private static void searchByIdController() {
        System.out.println("Please Input Employee's ID");
        String employeeId = scanner.nextLine();
        Employee emp = es.getByEmployeeId(employeeId);
        if (emp == null) {
            System.err.println("There is not employee in such ID");
            return;
        }
        System.out.println(emp);
    }

    private static void searchByCompanyNameController() {
        System.out.println("For seeing information about the employees Please input company's name");
        String companyName = scanner.nextLine();
        Employee[] colleagues = es.getByCompanyName(companyName);
        boolean employeeExist = false;
        for (Employee colleague : colleagues) {
            if (colleague != null) {
                employeeExist = true;
                System.out.println(colleague);
            }
        }
        if (!employeeExist) {
            System.err.println("There are no employees in this company");
        }
    }

    private static void searchBySalaryRangeController() {
        System.out.println("Please input salary range");
        System.out.println("From");
        double tmp1 = Double.parseDouble(scanner.nextLine());
        System.out.println("To");
        double tmp2 = Double.parseDouble(scanner.nextLine());
        if (tmp1 > tmp2 || tmp1 < 0 || tmp2 < 0) {
            System.err.println("Please ,input range correctly");
            return;
        }
        es.searchBySalaryRange(tmp1, tmp2);
    }

    private static void changePosition() {
        System.out.println("Please input ID");
        String empID = scanner.nextLine();
        Employee tmp = es.getByEmployeeId(empID);
        if (tmp == null) {
            System.err.println("There is not employee in such ID");
            return;
        }
        System.out.println("Please input new position");
        String position = scanner.nextLine();
        tmp.setPosition(position);
        System.out.println("Position is changed");

    }

    private static void inactivateEmployee() {
        System.out.println("Please input ID");
        String empID = scanner.nextLine();
        Employee tmp = es.getByEmployeeId(empID);
        if (tmp == null) {
            System.err.println("There is not employee in such ID");
            return;
        }
        if (tmp.getActive()) {
            tmp.setActive(false);
            System.out.println("The employee is no longer active");
        } else {
            System.out.println("The employee was soon inactive");
        }
    }

    private static void activateEmployee() {
        System.out.println("Please input ID");
        String empID = scanner.nextLine();
        Employee tmp = es.getByEmployeeId(empID);
        if (tmp == null) {
            System.err.println("There is not employee in such ID");
            return;
        }
        if (!tmp.getActive()) {
            tmp.setActive(true);
            System.out.println("The employee is already activated");
        } else {
            System.out.println("The employee is soon active");
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
            System.out.println("Please input 5 for search employee by salary range ");
            System.out.println("Please input 6 for change employee position by id");
            System.out.println("Please input 7 for print only active employees ");
            System.out.println("Please input 8 for inactive employee by id");
            System.out.println("Please input 9 for activate employee by id ");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRunning = false;
                    break;
                case "1":
                    addController();
                    break;
                case "2":
                    es.print();
                    break;
                case "3":
                    searchByIdController();
                    break;
                case "4":
                    searchByCompanyNameController();
                    break;
                case "5":
                    searchBySalaryRangeController();
                    break;
                case "6":
                    changePosition();
                    break;
                case "7":
                    es.printActiveEmployees();
                    break;
                case "8":
                    inactivateEmployee();
                    break;
                case "9":
                    activateEmployee();
                    break;
                default:
                    System.err.println("Wrong command, Please try again");
            }
        }
    }
}
