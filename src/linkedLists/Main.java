package linkedLists;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.printList();
        System.out.println();
        list.insertInFront(0);
        list.printList();
        LinkedList.Node<Integer> myNode = new LinkedList.Node<>(6);
        System.out.println(list.find(4));
        list.delete(4);
        list.printList();
        System.out.println(list.insertAfter(myNode,4));

        list.printList();
    }
}

