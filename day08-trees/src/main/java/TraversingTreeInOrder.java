import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TraversingTreeInOrder {



    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);

        System.out.println(inOrderTraversal(root));
    }


    public static List<Integer> inOrderTraversal(TreeNode root){
        //3 4 5 10 15
        TreeNode current=root;
        Stack<TreeNode> stack= new Stack<>();
         List<Integer> list=new ArrayList<>();
         while (current!=null || !stack.isEmpty()){
             if(current!=null) {
                 stack.push(current);
                 current=current.left;
             }else{
                 current= stack.pop();
                 list.add(current.value);
                 current=current.right;
             }
       }
        return list;
    }

    static class TreeNode{
        int value;
        TreeNode  left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }
}


