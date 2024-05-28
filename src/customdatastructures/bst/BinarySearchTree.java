package customdatastructures.bst;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem Link : https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 * @since 05/28/2024
 */

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    Node insert(Node node, int key) {
        if(node == null) {
            node = new Node(key);
            return node;
        }

        if( key < node.key) {
            node.left = insert(node.left, key);
        } else if(key > node.key) {
            node.right = insert(node.right, key);
        }

        return node;
    }

    Node search(Node root, int key) {
        if(root == null || root.key == key){
            return root;
        }
        if(root.key < key) {
            return search(root.right, key);
        }

        return search(root.left, key);
    }

    // TODO
    Boolean isBst(Node node) {
        if(root == null){
            return true;
        }

        return null;
    }

    // Left -> Root -> Right
    void printInorder(Node node) {
        if (node == null)
            return;

        // First recur on left child
        printInorder(node.left);

        // Then print the data of node
        System.out.print(node.key + " ");

        // Now recur on right child
        printInorder(node.right);
    }

    // Root -> Left -> Right
    void printPreorder(Node node) {
        if (node == null)
            return;

        // Then print the data of node
        System.out.print(node.key + " ");

        // First recur on left child
        printPreorder(node.left);

        // Now recur on right child
        printPreorder(node.right);
    }

    // Left -> Right -> Root
    void printPostorder(Node node) {
        if (node == null)
            return;

        // First recur on left child
        printPostorder(node.left);

        // Now recur on right child
        printPostorder(node.right);

        // Then print the data of node
        System.out.print(node.key + " ");
    }

    void printLevelOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {

            // poll() removes the present head.
            Node tempNode = queue.poll();
            System.out.print(tempNode.key + " ");

            // Enqueue left child
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            // Enqueue right child
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
}
