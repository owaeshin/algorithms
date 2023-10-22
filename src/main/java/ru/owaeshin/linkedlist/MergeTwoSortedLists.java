package ru.owaeshin.linkedlist;

import ru.owaeshin.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (list1 != null || list2 != null) {
            int val;
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    val = list1.val;
                    list1 = list1.next;
                } else {
                    val = list2.val;
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                val = list1.val;
                list1 = list1.next;
            } else {
                val = list2.val;
                list2 = list2.next;
            }
            tail.next = new ListNode(val);
            tail = tail.next;
        }
        return dummyHead.next;
    }

    public ListNode mergeTwoListsRec(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoListsRec(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoListsRec(l1, l2.next);
            return l2;
        }
    }
}
