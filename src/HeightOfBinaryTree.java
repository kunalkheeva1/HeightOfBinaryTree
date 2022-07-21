import java.util.LinkedList;
import java.util.Queue;

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
    static int heightOfBinaryTree(Node root){
        if(root == null) return 0;
        int level =0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            level++;
            while(size>0){
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
