package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ranidu", "Harshana", 22));

        for (Object employee: employeeList) {
            System.out.println(employee);
        }

//        System.out.println(employeeList.get(1));
//        System.out.println(employeeList.isEmpty());
        employeeList.set(0, new Employee("Heshan", "Ravindu", 22));

        for (Object employee: employeeList) {
            System.out.println(employee);
        }
    }
}
