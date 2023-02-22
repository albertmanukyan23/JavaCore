package homework.employee;

public interface Commands {
    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String ADD_COMPANY = "2";
    String PRINT_EMPLOYEES = "3";
    String SEARCH_EMPLOYEE_BY_ID = "4";
    String SEARCH_EMPLOYEE_BY_COMPANY_Id = "5";
    String SEARCH_EMPLOYEE_BY_SALARY_RANGE = "6";
    String CHANGE_EMPLOYEE_POSITION_BY_ID = "7";
    String PRINT_ACTIVE_EMPLOYEES = "8";
    String INACTIVE_EMPLOYEES = "9";
    String ACTIVE_EMPLOYEES = "10";
    String PRINT_COMPANIES = "11";

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit ");
        System.out.println("Please input " + ADD_EMPLOYEE + " for add employee ");
        System.out.println("Please input " + ADD_COMPANY + " for add company ");
        System.out.println("Please input " + PRINT_EMPLOYEES + " for print all employees ");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_ID + " for  search employee by employee ID ");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY_Id + " for search employee by company name ");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_SALARY_RANGE + " for search employee by salary range ");
        System.out.println("Please input " + CHANGE_EMPLOYEE_POSITION_BY_ID + " for change employee position by id");
        System.out.println("Please input " + PRINT_ACTIVE_EMPLOYEES + " for print only active employees ");
        System.out.println("Please input " + INACTIVE_EMPLOYEES + " for inactive employee by id");
        System.out.println("Please input " + ACTIVE_EMPLOYEES + " for activate employee by id ");
        System.out.println("Please input " + PRINT_COMPANIES + "for print all employees");
    }

}
