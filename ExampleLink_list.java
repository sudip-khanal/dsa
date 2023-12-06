public class ExampleLink_list {
    Node head;
    private int size;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;

            return;
        }
        Node lasNode = head;
        while (lasNode.next != null) {
            lasNode = lasNode.next;

        }
        lasNode.next = newNode;

    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = this.head.next;
        size--;

    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data + "->");
            currNode = currNode.next;

        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        ExampleLink_list list = new ExampleLink_list();
        list.addFirst("a");

        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
        System.out.println("size of the list " + list.getSize());
        list.addFirst("this");
        list.printList();
        System.out.println("size of the list " + list.getSize());

    }
}
