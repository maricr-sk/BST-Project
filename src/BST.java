import java.util.*;

public class BST {

    private Set<Integer> visited;
    private Stack<Integer> stack;
    //attributes -> attributes imply state
    private BSTnode root;

    public boolean hasEdge(){}
    public BST(int value){ this.root = new BSTnode(value); }

    //methods

    public void add(int value){ this.add(root, value); }

    public void preOrder(){ this.preOrder(this.root); }
    public void postOrder(){ this.postOrder(this.root);}
    public void inOrder(){ this.inOrder(this.root);}
    public void levelOrder(){ this.levelOrder(this.root);}
    public void DFS() {this.DFS(this.root);}

    public boolean search(int target) {return this.search(this.root, target); }

    private void preOrder(BSTnode root){
        if(root == null) { return; }
        System.out.print(root + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private BSTnode add(BSTnode root, int value){
        if (root == null) {
            BSTnode node = new BSTnode(value);
            root = node;
            return root; }
       if(value >= root.data){ root.right = add(root.right, value); }
       else{ root.left = add(root.left, value); }
        return root;
    }

    private void postOrder(BSTnode root){
        if(root == null) {
            return; }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root + " ");
    }

    private void inOrder(BSTnode root){
        if(root == null) {
            return; }
        inOrder(root.left);
        System.out.print(root + " ");
        inOrder(root.right);
    }

    private void levelOrder(BSTnode root){
        Queue<BSTnode> q = new LinkedList<>();
        if(this.root == null) {
            System.out.println("Tree is empty");
            return; }
        q.add(root);
        while(!q.isEmpty()){
            BSTnode temp = q.poll(); //or remove
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(temp.data + " "); }
    }

    public boolean isLeaf(BSTnode node){
        return node.left == null && node.right == null;
    }

    private boolean search(BSTnode root, int target){
        if(root == null){ return false; }
        if (root.data == target) { return true; }
        if(target > root.data)
            return search(root.right, target);
        else
            return search(root.left, target);
    }  //use dps or bfs /stack/queue for level order traversal

    private String DFS(BSTnode root) {
        String answer = "";
        BSTnode node = root;
        ArrayList<String> list = new ArrayList();
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> working = new Stack<>();
        while (node != null) {
            working.push(node.data);
            System.out.println(node);
            if (node.left == null) {

            }
            if (node.left.data < node.right.data) {
                if (DFS(node.left) != null) {

                }
            }

        }
        if (node.right.data < node.left.data) {
            DFS(node.right) {
                return answer;
            }
        }
    }

}