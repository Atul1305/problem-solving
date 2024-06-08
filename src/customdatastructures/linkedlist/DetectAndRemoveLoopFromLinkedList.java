package customdatastructures.linkedlist;

/*
 * Link -> https://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/
 * Solution : Verified
 */

public class DetectAndRemoveLoopFromLinkedList {

    int detectLoop(Node node) {
        Node slow = node, fast = node;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                removeLoop(slow, node);
                return 1;
            }
        }

        return 0;
    }

    void removeLoop(Node loop, Node head) {
        Node ptr1 = loop;
        Node ptr2 = loop;

        Node prevNode = ptr1;
        while(ptr1.next != ptr2) {
            prevNode = ptr1;
            ptr1 = ptr1.next;
        }

        prevNode.next = null;

    }
}
