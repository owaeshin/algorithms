package ru.owaeshin.other;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ZigZagIterator {

    LinkedList<Iterator<Integer>> list = new LinkedList<>();

    public ZigZagIterator(List<Integer> v1, List<Integer> v2) {
        if (!v1.isEmpty())
            list.add(v1.iterator());
        if (!v2.isEmpty())
            list.add(v2.iterator());
    }

    public int next() {
        final Iterator it = list.poll();
        final int next = (int) it.next();
        if (it.hasNext())
            list.offer(it);
        return next;
    }

    public boolean hasNext() {
        return !list.isEmpty();
    }
}