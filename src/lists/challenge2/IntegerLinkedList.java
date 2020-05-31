package lists.challenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(null);
        if (head == null) {
            head = newNode;
            return;
        }
        IntegerNode nextNode = head;
        IntegerNode prevNode = null;
        while ((nextNode != null) && (nextNode.getValue() <= value)) {
            prevNode = nextNode;
            nextNode = nextNode.getNext();
        }
        if (prevNode == null) {
            newNode.setNext(nextNode);
            head = newNode;
            return;
        }
        prevNode.setNext(newNode);
        newNode.setNext(nextNode);
        return;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
