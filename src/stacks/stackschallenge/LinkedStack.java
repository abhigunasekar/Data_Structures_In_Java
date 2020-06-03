package stacks.stackschallenge;

import stacks.linkedstack.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

// Use LinkedList class if memory is not an issue,
// Otherwise, use our own implementation of the array class or a singly linked list.

public class LinkedStack {
    private LinkedList<Character> stack;

    /*
        Linked List Class implements the Deque interface, which contains:
            - push()
            - pop()
            - peek() methods
     */

    public LinkedStack() {
        stack = new LinkedList<Character>();
    }

    public void push(Character letter) {
        stack.push(letter);
    }

    public Character pop() {
        return stack.pop();
    }

    public Character peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Character> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        return;
    }
}
