package ru.owaeshin.linkedlist;

import ru.owaeshin.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * <p>
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> values = new HashSet<>();
        while (head != null) {
            if (values.contains(head)) {
                return true;
            } else {
                values.add(head);
                head = head.next;
            }
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }


}
