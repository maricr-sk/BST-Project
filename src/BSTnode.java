public class BSTnode {

    int data;
    BSTnode left;
    BSTnode right;
    //int freq;

    @Override public String toString(){
        return data + "";
    }

    public BSTnode(int data){
        this.data = data;
        left = null;
        // freq = 1; to handle duplicates
        right = null;
    }

}
