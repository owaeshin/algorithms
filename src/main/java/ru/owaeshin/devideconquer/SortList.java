package ru.owaeshin.devideconquer;

import ru.owaeshin.ListNode;

import java.util.ArrayList;
import java.util.List;

public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        values = values.stream().sorted().toList();
        ListNode resHead = new ListNode(values.get(0));
        var res = resHead;
        for (int i = 1; i < values.size(); i++) {
            resHead.next = new ListNode(values.get(i));
            resHead = resHead.next;
        }
        return res;
    }
}
