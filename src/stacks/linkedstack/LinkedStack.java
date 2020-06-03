package stacks.linkedstack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

// Use LinkedList class if memory is not an issue,
// Otherwise, use our own implementation of the array class or a singly linked list.

public class LinkedStack {
    private LinkedList<Employee> stack;

    /*
        Linked List Class implements the Deque interface, which contains:
            - push()
            - pop()
            - peek() methods
     */

    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        return;
    }
}
