package ru.owaeshin.arrays;

public class RemoveSmile {
    /*
* Есть сообщения из соцсети, например:
* "Я работаю в Гугле :-)))"
* 
* Хочется удялить смайлики из сообщений, подпадающие под регулярку ":-\)+|:-\(+" за линейное время. 
* То есть, сделать так:
* "Я работаю в Гугле :-)))" -> "Я работаю в Гугле "
* "везет :-) а я туда собеседование завалил:-((" -> "везет  а я туда
собеседование завалил"
* "лол:)" - >"лол:)"
* "Ааааа!!!!! :-))(())" -> "Ааааа!!!!! (())""
*/

    public static void main(String[] args) {
        System.out.println(removeSmiles("L ncftip r lstph :-)))"));
        System.out.println(removeSmiles("Uqgagy :-) u x ldvb zbbzzfe iafvvuw:-(("));
        System.out.println(removeSmiles("dvz:)"));
        System.out.println(removeSmiles("Ldbcd!!!!! :-))(())"));
        System.out.println(removeSmiles(":-))))(("));
        System.out.println(removeSmiles("3:-("));
        System.out.println(removeSmiles("3:-("));
        System.out.println(removeSmiles(":-:-)))((("));
    }

    public static String removeSmiles(String input) {
        var len = input.length();
        var result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            boolean predicate = input.charAt(i) == ':' 
                                && i + 2 < len 
                                && input.charAt(i + 1) == '-' 
                                && (input.charAt(i + 2) == '(' || input.charAt(i + 2) == ')');
            if (predicate) {
                int j = i + 2;
                while (j + 1 < len && input.charAt(j) == input.charAt(j + 1)) {
                    j++;
                }
                i = j;
            } else {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

    public static String removeSmilesSimple(String input) {
        return input.replaceAll(":-\\)+|:-\\(+", "");
    }
}
