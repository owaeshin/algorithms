package ru.owaeshin.bst;

import ru.owaeshin.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderRecursive(root, res);
        return res;
    }

    private void inorderRecursive(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inorderRecursive(root.left, res);
        }
        res.add(root.val);
        if (root.right != null) {
            inorderRecursive(root.right, res);
        }
    }

    private List<Integer> inorderStack(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.pop();
        var curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr!= null) {
                stack.add(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}
