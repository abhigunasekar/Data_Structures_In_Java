package lists.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
    Operations:
    - add() - O(n)
    - add(index, ) - O(n)
    - set(index, ) - O(1)
    - get(index) - O(1)
    - size() - O(1)
    - contains() - O(n)
    - indexOf() - O(n)
    - remove(index) - O(n)
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

//        employeeList.forEach(employee -> System.out.println(employee));
//
//        System.out.println(employeeList.get(1));
//
//        System.out.println(employeeList.isEmpty());

       employeeList.set(1, new Employee("John", "Adams", 4568));
//        employeeList.forEach(employee -> System.out.println(employee));
//        System.out.println(employeeList.size());
//
       employeeList.add(3, new Employee("John", "Doe", 4567));

//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for (Employee employee: employeeArray) {
//            System.out.println(employee);
//        }
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }

}
