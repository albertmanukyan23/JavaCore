package homework.employee.model;

import homework.employee.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String id;
    private Date registerDate;
    private Date dateOfBirthday;
    private double salary;
    private Company company;
    private String position;
    private boolean isActive = true;

    public Employee() {
    }

    public Employee(String name, String surname, String employeeID, Date dateOfBirthday,
                    double salary, Company company, String position, Date registerDate) {
        this.name = name;
        this.surname = surname;
        this.id = employeeID;
        this.dateOfBirthday = dateOfBirthday;
        this.salary = salary;
        this.company = company;
        this.position = position;
        this.registerDate = registerDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String employeeID) {
        this.id = employeeID;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public boolean isActive() {
        return isActive;
    }

    public void changeActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && isActive == employee.isActive && Objects.equals(name, employee.name)
                && Objects.equals(surname, employee.surname) && Objects.equals(id, employee.id) && Objects.equals(registerDate, employee.registerDate) &&
                Objects.equals(dateOfBirthday, employee.dateOfBirthday) && Objects.equals(company, employee.company) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, registerDate, dateOfBirthday, salary, company, position, isActive);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", registerDate=" + DateUtil.dateToString(registerDate) +
                ", dateOfBirthday=" + DateUtil.dateToString(dateOfBirthday) +
                ", salary=" + salary +
                ", company=" + company +
                ", position='" + position + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
