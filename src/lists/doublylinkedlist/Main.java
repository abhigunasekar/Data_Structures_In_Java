package lists.doublylinkedlist;

import lists.singlylinkedlist.EmployeeLinkedList;

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

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();
        System.out.println("Size = " + list.getSize());

        list.addBefore(new Employee("Abhi", "Guna", 2022), mikeWilson);
        list.printList();
        System.out.println("Size = " + list.getSize());

//        Employee billEnd = new Employee("Bill", "End", 78);
//        list.addToEnd(billEnd);
//        list.printList();
//        System.out.println("Size = " + list.getSize());
//        list.removeFromFront();
//        list.printList();
//        System.out.println("Size = " + list.getSize());
//        list.removeFromEnd();
//        list.printList();
//        System.out.println("Size = " + list.getSize());
    }

}
