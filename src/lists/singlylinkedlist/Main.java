package lists.singlylinkedlist;

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
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        EmployeeLinkedList list = new EmployeeLinkedList();
        //System.out.println(list.isEmpty());
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        System.out.println("Before Size = " + list.getSize());
        list.printList();
        list.removeFromFront();
        System.out.println("New Size = " + list.getSize());
        list.printList();
    }

}
