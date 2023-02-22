package homework.employee.storage;

import homework.employee.model.Company;
import homework.employee.model.Employee;

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

    public Employee getByEmployeeId(String id) {
        for (int i = 0; i < size; i++) {
            if (array[i].getId().equals(id)) {
                return array[i];
            }
        }
        return null;
    }

    public void getEmployeeByCompany(Company company) {
        for (int i = 0; i < size; i++) {
            if (array[i].getCompany().equals(company)) {
                System.out.println(array[i]);
            }
        }
    }

    public Employee[] getBySalaryRange(double min, double max) {
        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            if (array[i].getSalary() >= min && array[i].getSalary() <= max) {
                employees[i] = array[i];
            }
        }
        return employees;
    }

    public void printByStatus(boolean active) {
        if (size == 0) {
            System.err.println("The storage is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (array[i].isActive() == active) {
                System.out.println(array[i] + " ");
            }
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
