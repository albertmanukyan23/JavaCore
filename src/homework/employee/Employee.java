package homework.employee;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String id;
    private double salary;
    private String company;
    private String position;
    private boolean isActive;

    public Employee() {
    }

    public Employee(String name, String surname, String employeeID, double salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.id = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public boolean getActive() {
        return isActive;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(String employeeID) {
        this.id = employeeID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeID='" + id + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", isActive='" + isActive + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        if (!Objects.equals(name, employee.name)) return false;
        if (!Objects.equals(surname, employee.surname)) return false;
        if (!Objects.equals(id, employee.id)) return false;
        if (!Objects.equals(company, employee.company)) return false;
        if (!Objects.equals(isActive, employee.isActive)) return false;
        return Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, salary, company, position, isActive);
    }
}
