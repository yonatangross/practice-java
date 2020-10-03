package linkedLists;

public class LinkedList<T> {
    Node<T> head;

    public void insertInFront(T data) {
        Node<T> newHead = new Node<>(data);
        newHead.next = head;
        head = newHead;
    }

    static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T value) {
            data = value;
        }

        public Node<T> next() {

            return next;
        }

        public T value() {
            return data;
        }

        public void next(Node<T> element) {
            next = element;
        }

        public void value(T value) {
            data = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public Node<T> insert(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next(null);

        if (this.head == null)
            this.head = newNode;
        else {
            Node<T> lastNode = this.head;
            while (lastNode.next() != null) {
                lastNode = lastNode.next();
            }
            lastNode.next(newNode);
        }
        return head;
    }

    public void printList() {
        Node<T> current = this.head;
        while (current != null) {
            System.out.print(current.data.toString() + " ");
            current = current.next;
        }
    }

    public Node<T> find(T data) {
        Node<T> curr = head;
        while (curr != null && curr.data != data) {
            curr = curr.next;
        }
        return curr;
    }

    public void delete(T value) {
        Node<T> prev = null;
        Node<T> curr = head;

        if (curr.data == value) {
            head = curr.next;
            return;
        }

        while (curr != null && curr.data != value) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) return;

        // unlink the node
        prev.next = curr.next;
    }
}
