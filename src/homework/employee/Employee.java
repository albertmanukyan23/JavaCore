package homework.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String id;
    private Date registerDate;
    private Date dateOfBirthday;
    private double salary;
    private String company;
    private String position;
    private boolean isActive = true;

    public Employee() {
    }

    public Employee(String name, String surname, String employeeID, Date dateOfBirthday, double salary, String company, String position ,Date registerDate )  {
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

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    public Date getRegisterDate() {
        return registerDate;
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

    public boolean isActive() {
        return isActive;
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

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
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

    public void changeActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && isActive == employee.isActive && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(id, employee.id) && Objects.equals(registerDate, employee.registerDate) && Objects.equals(dateOfBirthday, employee.dateOfBirthday) && Objects.equals(company, employee.company) && Objects.equals(position, employee.position);
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
                ", registerDate=" + EmployeeDemo.sdf.format(registerDate) +
                ", dateOfBirthday=" + EmployeeDemo.sdf.format(dateOfBirthday) +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
