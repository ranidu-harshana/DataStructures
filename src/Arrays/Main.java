package Arrays;

import ArrayList.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Ranidu", "Harshana", 1));
        employeeList.add(new Employee("Dasun", "Kalhara", 2));

        Employee[] employeeArray;
        employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee: employeeList) {
            System.out.println(employee);
        }
    }
}
