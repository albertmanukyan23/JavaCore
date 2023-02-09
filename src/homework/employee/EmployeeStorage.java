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
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // id is unique for every employee
    public Employee searchByID(String id) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().toLowerCase().equals(id.toLowerCase())) {
                return array[i];
            }
        }
        return null;
    }

    public Employee[] searchByCompanyName(String companyName) {
        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            if (array[i].getCompany().toLowerCase().equals(companyName.toLowerCase())) {
                employees[i] = array[i];
            }
        }
        return employees;
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
