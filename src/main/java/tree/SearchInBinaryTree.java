package tree;

/*
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 */
public class SearchInBinaryTree {
    public TreeNode searchBST_Recursion(TreeNode root, int val) {
        if (root == null)
            return root;
        if (root.val == val)
            return root;

        return val<root.val ? searchBST_Recursion(root.left,val) : searchBST_Recursion(root.right,val);
    }

    public TreeNode searchBST_Iterative(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = val<root.val ? root.left : root.right;
        }
        return root;
    }
}
