package ru.owaeshin.bst;

import ru.owaeshin.TreeNode;

public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(r, l) + 1;
    }
}

