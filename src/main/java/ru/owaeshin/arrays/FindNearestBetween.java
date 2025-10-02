package ru.owaeshin.arrays;

public class FindNearestBetween {
    /*
Условие:
Дана строка, состоящая из букв 'X', 'Y' и 'O'. 
Необходимо найти кратчайшее расстояние между буквами 'X' и 'Y', 
либо вывести 0, если 'X' либо 'Y' отсутствуют.
*/

    public static void main(String[] args) {
        System.out.println(distance("XX")); // 1
        System.out.println(distance("YY")); // 1
        System.out.println(distance("XY")); // 1
        System.out.println(distance("YOX")); // 2
        System.out.println(distance("OOOXXOY")); // 2
        System.out.println(distance("OOOXOOYOXO")); // 2
    }

    public static Integer distance(String input) {
        int lastX = -1;
        int lastY = -1;
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < input.toCharArray().length; i++) {
            if (input.charAt(i) == 'X') {
                lastX = i;
            } else if (input.charAt(i) == 'Y') {
                lastY = i;
            }
            if (lastX > -1 && lastY > -1) {
                minDist = Math.min(minDist, Math.abs(lastX - lastY));
            }
        }
        return minDist == Integer.MAX_VALUE ? 1 : minDist;
    }
}
