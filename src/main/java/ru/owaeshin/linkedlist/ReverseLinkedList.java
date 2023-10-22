package ru.owaeshin.linkedlist;

import ru.owaeshin.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        List<ListNode> reverseNodes = new ArrayList<>();
        var node = head;
        while (node != null) {
            reverseNodes.add(node);
            node = node.next;
        }
        if (reverseNodes.size() == 0) {
            return null;
        }
        reverseNodes.get(0).next = null;
        for (int i = reverseNodes.size() - 1; i >= 1; i--) {
            reverseNodes.get(i).next = reverseNodes.get(i - 1);
        }
        return reverseNodes.get(reverseNodes.size() - 1);
    }
    public ListNode reverseListIterative(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            var next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
