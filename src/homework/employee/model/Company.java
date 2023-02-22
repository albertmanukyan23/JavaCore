package homework.employee.model;


import java.util.Objects;

public class Company {
    private String id;
    private String name;
    private String address;
    private int employeesCount;

    public Company() {
    }

    public Company(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return employeesCount == company.employeesCount && Objects.equals(id, company.id) && Objects.equals(name, company.name) && Objects.equals(address, company.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, employeesCount);
    }

    @Override
    public java.lang.String toString() {
        return "Company{" +
                "id=" + id +
                ", name=" + name +
                ", address=" + address +
                ", employeesCount=" + employeesCount +
                '}';
    }
}
