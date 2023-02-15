package homework.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeStorage es = new EmployeeStorage();
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        boolean isRunning = true;

        while (isRunning) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRunning = false;
                    break;
                case "1":
                    add();
                    break;
                case "2":
                    es.print();
                    break;
                case "3":
                    searchById();
                    break;
                case "4":
                    searchByCompanyName();
                    break;
                case "5":
                    searchBySalaryRange();
                    break;
                case "6":
                    changePositionByEmployeeId();
                    break;
                case "7":
                    es.printByStatus(true);
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

    private static void printCommands() {
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
    }

    private static void add() throws ParseException {
        System.out.println("Please input Employee's name, surname, id, date of birthday, salary, company, position with commas");
        System.out.println("For every employee ID must be unrepeatable ,start with the letter A and consist of 4 symbols");
        String[] data = scanner.nextLine().split(",");
        if (es.getByEmployeeId(data[2]) != null) {
            System.err.println("ID already exists. Please enter a unique ID.");
        } else if (!data[2].startsWith("A") || data[2].length() != 4) {
            System.err.println("Please enter a valid ID");
        } else {
            Employee newEmployee = new Employee(data[0], data[1], data[2], sdf.parse(data[3]), Double.parseDouble(data[4]), data[5], data[6]);
            Date date = new Date();
            newEmployee.setRegisterDate(date);
            es.add(newEmployee);
            System.out.println("registration succeeded");
        }
    }

    private static void searchById() {
        System.out.println("Please Input Employee's ID");
        String employeeId = scanner.nextLine();
        Employee emp = es.getByEmployeeId(employeeId);
        if (emp == null) {
            System.err.println("There is not employee in such ID");
            return;
        }
        System.out.println(emp);
    }

    private static void searchByCompanyName() {
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

    private static void searchBySalaryRange() {
        System.out.println("Please input salary range");
        System.out.println("From");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.println("To");
        double max = Double.parseDouble(scanner.nextLine());
        if (min > max || min < 0 || max < 0) {
            System.err.println("Please ,input range correctly");
            return;
        }
        Employee[] employees = es.getBySalaryRange(min, max);
        boolean isExist = false;
        for (Employee employee : employees) {
            if (employee != null) {
                isExist = true;
                System.out.println(employee);
            }
        }
        if (!isExist) {
            System.err.println("There are no employees in this range");
        }
    }

    private static void changePositionByEmployeeId() {
        es.printByStatus(true);
        System.out.println("Please choose Employee's ID");
        String empID = scanner.nextLine();
        Employee employee = es.getByEmployeeId(empID);
        if (employee == null) {
            System.err.println("There is not employee in such ID");
            return;
        }
        System.out.println("Please input new position");
        String position = scanner.nextLine();
        employee.setPosition(position);
        System.out.println("Position changed");

    }

    private static void inactivateEmployee() {
        es.printByStatus(true);
        System.out.println("Please input ID");
        String empID = scanner.nextLine();
        Employee tmp = es.getByEmployeeId(empID);
        if (tmp == null) {
            System.err.println("There is not employee in such ID");
            return;
        }
        if (tmp.isActive()) {
            tmp.changeActive(false);
            System.out.println("The employee is no longer active");
        } else {
            System.out.println("The employee was soon inactive");
        }
    }

    private static void activateEmployee() {
        es.printByStatus(false);
        System.out.println("Please input ID");
        String empID = scanner.nextLine();
        Employee tmp = es.getByEmployeeId(empID);
        if (tmp == null) {
            System.err.println("There is not employee in such ID");
            return;
        }
        if (!tmp.isActive()) {
            tmp.changeActive(true);
            System.out.println("The employee is already activated");
        } else {
            System.out.println("The employee is soon active");
        }
    }
}
