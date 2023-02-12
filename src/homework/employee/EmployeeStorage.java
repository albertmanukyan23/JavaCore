package homework.employee;


public class EmployeeStorage {
    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == array.length) {
            extend();
        }
        array[size++] = employee;
    }

    private void extend() {
        Employee[] newArray = new Employee[array.length + 10];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public Employee getByEmployeeID(String id) {
        for (int i = 0; i < size; i++) {
            if (array[i].getID().equals(id)) {
                return array[i];
            }
        }
        return null;
    }

    public Employee[] getByCompanyName(String companyName) {
        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            if (array[i].getCompany().toLowerCase().equals(companyName.toLowerCase())) {
                employees[i] = array[i];
            }
        }
        return employees;
    }

    public void searchBySalaryRange(double tmp1, double tmp2) {
        boolean salaryIsExist = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getSalary() > tmp1 && array[i].getSalary() < tmp2) {
                salaryIsExist = true;
                System.out.println(array[i] + " ");
            }
        }
        if (!salaryIsExist) {
            System.out.println("There are not Employees in that salary range");
        }
    }

    public void printActiveEmployees() {
        boolean areActiveEmployees = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getActive()) {
                areActiveEmployees = true;
                System.out.println(array[i] + " ");
            }
        }
        if (!areActiveEmployees) {
            System.err.println("There are not Active Employees");
        }
    }

    public void print() {
        if (size == 0) {
            System.err.println("The storage is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
