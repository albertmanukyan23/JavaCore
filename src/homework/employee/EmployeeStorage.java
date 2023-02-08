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
    public void searchByID(String id) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().toLowerCase().equals(id.toLowerCase())) {
                System.out.println(array[i]);
                return;
            }
        }
        System.err.println("There is no employee with such id, Please try again");
    }

    public void searchByCompanyName(String companyName) {
        boolean nameIsExist = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getCompany().toLowerCase().equals(companyName.toLowerCase())) {
                nameIsExist = true;
                System.out.println(array[i]);
            }
        }
        if (!nameIsExist) {
            System.err.println("There is no company with such name in our storage, Please try again");
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
    public boolean idIsUnique(String id){
        boolean isUnique = true;
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().toLowerCase().equals(id.toLowerCase())){
                isUnique = false;
            }
        }
        return  isUnique;
    }
}
