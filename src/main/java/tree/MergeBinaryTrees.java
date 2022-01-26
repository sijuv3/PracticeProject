package tree;

/*
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
public class MergeBinaryTrees {
    public static void main(String[] args) {
        MergeBinaryTrees m = new MergeBinaryTrees();
        TreeNode tn5 = new TreeNode(5);
        TreeNode tn3 = new TreeNode(3, tn5, null);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn1 = new TreeNode(1, tn3, tn2);
        //m.mergeTrees();
        //m.merge();
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;

        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    public TreeNode merge(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return null;
        else if (t1 == null)
            return t2;
        else if (t2 == null)
            return t1;

        TreeNode n = new TreeNode(t1.val + t2.val);
        n.left = merge(t1.left, t2.left);
        n.right = merge(t1.right, t2.right);
        return n;
    }
}
