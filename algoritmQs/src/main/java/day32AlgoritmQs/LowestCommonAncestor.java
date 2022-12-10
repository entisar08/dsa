package day32AlgoritmQs;


public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root;
        TreeNode p,q;
        root = getSampleTreeNode1(); //root=13
        p = root.left.right; //-13
        q = root.left.left.left; //q=-25
        VisualizeTree.printTree(root, null, false);
        System.out.println("INPUTS: root node => " + root.val + " p=> " + p.val + " q=> " + q.val + " expected output => -10");
        System.out.println(lowestCommonAncestor( root,  p,  q).val);
    }

    static TreeNode getSampleTreeNode1() {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(-15);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(-22);
        root.left.right = new TreeNode(-13);
        root.left.left.left = new TreeNode(-25);

        return root;
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;

        int small=Math.min(p.val,q.val);
        int large=Math.max(p.val,q.val);
        TreeNode current = root;
        while (root!=null) {

            if (small > root.val ) {
                root = root.right;

            } else if (large < root.val ) {
                root = root.left;

            } else {
                return root;

            }
        }
        return null;
    }

}
