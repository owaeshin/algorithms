package ru.owaeshin.linkedlist;

import ru.owaeshin.ListNode;

import java.util.ArrayList;
import java.util.List;

public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        var pointer = head;
        List<ListNode> nodes = new ArrayList<>();
        while (pointer != null) {
            nodes.add(pointer);
            pointer = pointer.next;
        }
        if (nodes.size() > 1) {
            var midInd = nodes.size() / 2;
            var midNode = nodes.get(midInd);
            var prevMid = nodes.get(midInd - 1);
            prevMid.next = midNode.next;
        }
        if (nodes.size() == 1) {
            head = null;
        }
        return head;
    }
}
