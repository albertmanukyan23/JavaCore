package homework.employee.storage;


import homework.employee.model.Company;
import homework.employee.model.Employee;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company) {
        if (size == companies.length) {
            extend();
        }
        companies[size++] = company;
    }

    private void extend() {
        Company[] newArray = new Company[companies.length + 10];
        System.arraycopy(companies, 0, newArray, 0, size);
        companies = newArray;
    }

    public Company getCompanyById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getId().equals(id)) {
                return companies[i];
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        if (size == 0) {
            System.err.println("The storage is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i] + " ");
        }
    }
}
