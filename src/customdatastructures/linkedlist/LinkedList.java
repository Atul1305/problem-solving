package customdatastructures.linkedlist;

public class LinkedList {
    Node head;

    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        return list;
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.println("Linked List : ");

        while(currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
}
