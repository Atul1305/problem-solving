package customdatastructures.queue;

public class Queue {
    public int length;
    public Node front, rear;

    public void enqueue(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (length == 0) {
            front = newNode;
            front.next = rear;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = rear.next;
        }
        length++;
    }
}
