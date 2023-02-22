package homework.employee;

import homework.employee.model.Company;
import homework.employee.model.Employee;
import homework.employee.storage.CompanyStorage;
import homework.employee.storage.EmployeeStorage;
import homework.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final EmployeeStorage ES = new EmployeeStorage();
    private static final CompanyStorage CS = new CompanyStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRunning = true;

        while (isRunning) {
            Commands.printCommands();
            String command = SCANNER.nextLine();
            switch (command) {
                case EXIT:
                    isRunning = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_EMPLOYEES:
                    ES.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    searchById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_Id:
                    searchByCompanyId();
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchBySalaryRange();
                    break;
                case CHANGE_EMPLOYEE_POSITION_BY_ID:
                    changePositionByEmployeeId();
                    break;
                case PRINT_ACTIVE_EMPLOYEES:
                    ES.printByStatus(true);
                    break;
                case INACTIVE_EMPLOYEES:
                    inactivateEmployee();
                    break;
                case ACTIVE_EMPLOYEES:
                    activateEmployee();
                    break;
                case PRINT_COMPANIES:
                    CS.print();
                    break;
                default:
                    System.err.println("Wrong command, Please try again");
            }
        }
    }

    private static void addCompany() {
        System.out.println("Please input company's id,name,address");
        String[] companyData = SCANNER.nextLine().split(",");
        if (CS.getCompanyById(companyData[0]) != null) {
            System.err.println("ID already exists. Please enter a unique ID.");
            return;
        }
        Company newCompany = new Company(companyData[0], companyData[1], companyData[2]);
        CS.add(newCompany);
        System.out.println("Company was added!!");
    }

    private static void addEmployee() throws ParseException {
        if (CS.getSize() == 0) {
            System.out.println("Please add company first");
            return;
        }
        CS.print();
        System.out.println("Please choose company id for adding employee");
        String companyId = SCANNER.nextLine();
        Company companyById = CS.getCompanyById(companyId);
        if (companyById != null) {
            System.out.println("Please input Employee's name, surname, id, date of birthday(21/12/2003), salary, position ");
            System.out.println("For every employee ID must be unrepeatable ,start with the letter A and consist of 4 symbols");
            String[] data = SCANNER.nextLine().split(",");
            if (ES.getByEmployeeId(data[2]) != null) {
                System.err.println("ID already exists. Please enter a unique ID.");
            } else if (!data[2].startsWith("A") || data[2].length() != 4) {
                System.err.println("Please enter a valid ID");
            } else {
                Employee newEmployee = new Employee(data[0], data[1], data[2], DateUtil.stringToDate(data[3]), Double.parseDouble(data[4]), companyById, data[5], new Date());
                ES.add(newEmployee);
                companyById.setEmployeesCount(companyById.getEmployeesCount() + 1);
                System.out.println("registration succeeded");
            }
        } else {
            System.out.println("Wrong company id!!");
        }
    }

    private static void searchById() {
        System.out.println("Please Input Employee's ID");
        String employeeId = SCANNER.nextLine();
        Employee emp = ES.getByEmployeeId(employeeId);
        if (emp == null) {
            System.err.println("There is not employee in such ID");
            return;
        }
        System.out.println(emp);
    }

    private static void searchByCompanyId() {
        if (CS.getSize() == 0) {
            System.out.println("Your CompanyStorage is empty");
            return;
        }
        CS.print();
        System.out.println("Please input company id");
        String companyId = SCANNER.nextLine();
        Company company = CS.getCompanyById(companyId);
        if (company != null) {
            ES.getEmployeeByCompany(company);
            return;
        }
        System.err.println("Company does not exists");
    }

    private static void searchBySalaryRange() {
        System.out.println("Please input salary range");
        System.out.println("From");
        double min = Double.parseDouble(SCANNER.nextLine());
        System.out.println("To");
        double max = Double.parseDouble(SCANNER.nextLine());
        if (min > max || min < 0 || max < 0) {
            System.err.println("Please ,input range correctly");
            return;
        }
        Employee[] employees = ES.getBySalaryRange(min, max);
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
        ES.printByStatus(true);
        System.out.println("Please choose Employee's ID");
        String empID = SCANNER.nextLine();
        Employee employee = ES.getByEmployeeId(empID);
        if (employee == null) {
            System.err.println("There is not employee in such ID");
            return;
        }
        System.out.println("Please input new position");
        String position = SCANNER.nextLine();
        employee.setPosition(position);
        System.out.println("Position changed");

    }

    private static void inactivateEmployee() {
        ES.printByStatus(true);
        System.out.println("Please input ID");
        String empID = SCANNER.nextLine();
        Employee tmp = ES.getByEmployeeId(empID);
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
        ES.printByStatus(false);
        System.out.println("Please input ID");
        String empID = SCANNER.nextLine();
        Employee tmp = ES.getByEmployeeId(empID);
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
