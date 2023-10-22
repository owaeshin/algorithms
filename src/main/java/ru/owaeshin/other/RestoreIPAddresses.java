package ru.owaeshin.other;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
    public static void main(String[] args) {
        System.out.println(new RestoreIPAddresses().restoreIpAddresses("25525511135"));
        System.out.println(new RestoreIPAddresses().restoreIpAddresses("0000"));
        System.out.println(new RestoreIPAddresses().restoreIpAddresses("101023"));
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                for (int k = 1; k < 4; k++) {
                    int l = s.length() - i - j - k;
                    if (l > 0 && l < 4 && i + j + k + l == s.length()) {
                        int a = Integer.parseInt(s.substring(0, i));
                        int b = Integer.parseInt(s.substring(i, i + j));
                        int c = Integer.parseInt(s.substring(j + i, j + i + k));
                        int d = Integer.parseInt(s.substring(k + j + i));
                        if (a < 256 && b < 256 && c < 256 && d < 256) {
                            var str = a + "." + b + "." + c + "." + d;
                            if (str.length() == s.length() + 3)
                                res.add(str);
                        }
                    }
                }
            }
        }
        return res;
    }
}
