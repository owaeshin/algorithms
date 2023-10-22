package ru.owaeshin.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length < 2) {
            return Arrays.stream(strs).map(List::of).toList();
        }
        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();
        for (String str : strs) {
            HashMap<Character, Integer> mapChar = new HashMap<>();
            for (char c : str.toCharArray()) {
                mapChar.put(c, mapChar.getOrDefault(c, 0) + 1);
            }
            if (!map.containsKey(mapChar)) {
                map.put(mapChar, new ArrayList<>());
            }
            map.get(mapChar).add(str);

        }
        return map.values().stream().toList();
    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        if (strs.length < 2) {
            return Arrays.stream(strs).map(List::of).toList();
        }
        HashMap<String, List<String>> res = new HashMap<>();
        for (String str : strs) {
            var keyStr = keyString(str);
            if (!res.containsKey(keyStr)) {
                res.put(keyStr, new ArrayList<>());
            }
            res.get(keyStr).add(str);
        }
        return res.values().stream().toList();
    }

    private String keyString(String str) {
        char[] ca = new char[26];
        for (char c : str.toCharArray()) ca[c - 'a']++;
        return String.valueOf(ca);
    }

}
