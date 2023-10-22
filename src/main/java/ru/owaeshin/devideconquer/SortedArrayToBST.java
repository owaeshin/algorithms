package ru.owaeshin.devideconquer;

import ru.owaeshin.TreeNode;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return createNode(nums, 0, nums.length - 1);
    }

    private TreeNode createNode(int[] nums, int beg, int end) {
        if (end < 0) {
            return null;
        }
        int mid = (end - beg) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createNode(nums, 0, mid - 1);
        node.right = createNode(nums, mid + 1, end);
        return node;
    }
}
