package binarysearchtrees;

public class Main {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);
        intTree.traverseInOrder();
        intTree.traversePreOrder();

//
//        System.out.println(intTree.get(27));
//        System.out.println(intTree.get(17));
//        System.out.println(intTree.get(888));

//        System.out.println(intTree.min());
//        System.out.println(intTree.max());

//        intTree.delete(888);
//        intTree.traverseInOrder();
//        intTree.delete(27);
//        intTree.delete(25);

    }
}
