import java.util.LinkedList;
import java.util.Queue;
// node
public class HeightOfBinaryTree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    // return height
    static int heightOfBinaryTree(Node root){
        if(root == null) return 0;
        int level =0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        //until the queue gets emptied
        while(!q.isEmpty()){
            int size = q.size();
            level++;// first level and then so on

            while(size>0){
                //check the left and right and move accordingly
                Node current = q.remove();
                if(current.left != null){
                    q.add(current.left);
                }if(current.right != null){
                    q.add(current.right);
                }
                    size--;
            }
        }return level;

    }




    public static void main(String[] args) {

    }
}
