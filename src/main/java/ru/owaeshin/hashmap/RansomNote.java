package ru.owaeshin.hashmap;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        var map = new HashMap<Character, Integer>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c)) {
                int val = map.get(c);
                if (val < 1) {
                    return false;
                } else {
                    map.put(c, val - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        var note = new RansomNote();
        System.out.println(note.canConstruct("a", "b"));
        System.out.println(note.canConstruct("a", "ba"));
        System.out.println(note.canConstruct("aa", "ba"));
        System.out.println(note.canConstruct("aa", "baa"));
    }
}
