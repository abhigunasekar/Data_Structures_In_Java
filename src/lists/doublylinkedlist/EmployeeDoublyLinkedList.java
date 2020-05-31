package lists.doublylinkedlist;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (head == null) {
            tail = node;
        }
        else {
            head.setPrevious(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null) {
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    /*
       Challenge 1: Insert an add before method:
     */

    public void addBefore(Employee toInsert, Employee toFind) {
        EmployeeNode current = head;
        EmployeeNode newNode = new EmployeeNode(toInsert);
        while ((current != null) && !current.getEmployee().equals(toFind)) {
            current = current.getNext();
        }
        if (current == null) {
            return;
        }
        if (current.getPrevious() != null) {
            current.getPrevious().setNext(newNode);
            newNode.setPrevious(current.getPrevious());
            newNode.setNext(current);
            current.setPrevious(newNode);
        }
        else {
            newNode.setNext(current);
            current.setPrevious(newNode);
            head = newNode;
        }
        size++;
        return;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeNode removeFromFront() {
        if (head == null) {
            return null;
        }
        EmployeeNode removedNode = head;
        if (head.getNext() == null) {
            tail = null;
        }
        else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }
        if (tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }
        EmployeeNode removedNode = tail;
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }


    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getEmployee());
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
