package ru.owaeshin.arrays;

public class FuzzySearch {
    /*
Реализовать функцию приблизительного совпадения строк

fuzzysearch("car", "cartwheel");        // true
fuzzysearch("cwhl", "cartwheel");       // true
fuzzysearch("cwhee", "cartwheel");      // true
fuzzysearch("cartwheel", "cartwheel");  // true
fuzzysearch("cwheeel", "cartwheel");    // false
fuzzysearch("lw", "cartwheel");         // false
*/

    public static boolean fuzzysearch(String searchRequest, String text) {
        if (searchRequest.length() > text.length()) {
            return false;
        } 
        if (searchRequest.length() == text.length()) {
            return searchRequest.equals(text);
        }
        int reqInd = 0;
        for (int i = 0; i < text.toCharArray().length; i++) {
            if (searchRequest.charAt(reqInd) == text.charAt(i)) {
                reqInd++;
            }
            if (reqInd == searchRequest.length()) {
                return true;
            }
        }
        return reqInd == searchRequest.length();
    }

    public static void main(String[] args) {
        System.out.println(fuzzysearch("car", "cartwheel"));        // true
        System.out.println(fuzzysearch("cwhl", "cartwheel"));       // true
        System.out.println(fuzzysearch("cwhee", "cartwheel"));      // true
        System.out.println(fuzzysearch("cartwheel", "cartwheel"));  // true
        System.out.println(fuzzysearch("cwheeel", "cartwheel"));    // false
        System.out.println(fuzzysearch("lw", "cartwheel"));         // false
        System.out.println(fuzzysearch("cartlw", "cartwheel"));         // false
    }
}
