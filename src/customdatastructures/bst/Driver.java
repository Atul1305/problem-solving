package customdatastructures.bst;

public class Driver {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // print(tree, 6);
        // print(tree, 60);

        // var isBst = tree.isBst(tree.root);

        // DFS
        System.out.println("Inorder");
        tree.printInorder(tree.root);

        System.out.println();
        System.out.println("Preorder");
        tree.printPreorder(tree.root);

        System.out.println();
        System.out.println("Postorder");
        tree.printPostorder(tree.root);

        // BFS (Level Order)
        System.out.println();
        System.out.println("Level Order");
        tree.printLevelOrder(tree.root);
    }

    private static void print(BinarySearchTree tree, int key) {
        if (tree.search(tree.root, key) == null) {
            System.out.println(key + " not found.");
        } else {
            System.out.println(key + " found.");
        }
    }
}
