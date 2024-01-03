public class BSTTester {

    public static void main(String[] args) {
        /*BST bst = new BST(7);
        bst.add(29);
        bst.add(3);
        bst.add(8);
        bst.add(11);
        bst.add(9);
        bst.add(2);
        bst.add(6);
        bst.add(4);
         */
        BST bst = new BST(0);
        bst.add(5);
        bst.add(2);
        bst.add(7);
        bst.add(1);
        bst.add(3);
        bst.add(6);
        bst.add(4);

        /*
        System.out.println( "\nPre-Order: ");
        bst.preOrder();
        System.out.println("\nPost-Order: ");
        bst.postOrder();
        System.out.println("\nIn-Order: ");
        bst.inOrder();
        System.out.println("\nLevel-Order: ");
        bst.levelOrder();
        System.out.println();
         */

        System.out.println(bst.search(11));
        System.out.println(bst.search(99));
    }

}
