package ru.owaeshin.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    private void backtrack(List<String> list, String str, int open, int close, int n) {
        if (str.length() == n * 2) {
            list.add(str);
            return;
        }
        if (open < n) {
            backtrack(list, str + "(", open + 1, close, n);
        }
        if (close < open) {
            backtrack(list, str + ")", open, close + 1, n);
        }
    }
}
