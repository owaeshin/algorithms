package ru.owaeshin.arrays;

import java.util.Arrays;

public class FindBestSeatDist {

    /*
    Места в кинотеатре расположены в один ряд. Только что пришедший зритель выбирает место,
    чтобы сидеть максимально далеко от остальных зрителей в ряду.
    То есть расстояние от того места, куда сядет зритель до ближайшего к нему зрителя
    должно быть максимально.
    
    Гарантируется, что в ряду всегда есть свободные места и уже сидит хотя бы один зритель.
    
    Напишите функцию, которая по заданному ряду мест (массиву из нулей и единиц)
    вернёт расстояние (число промежутков между креслами) от выбранного места до ближайшего зрителя.
    
    Пример:
    [1, 0, 0, 0, 1] -> 2
    [1, 0, 1, 0, 0, 1, 0, 0, 0, 1]-> 2
    [1, 0, 1, 0] -> 1
    */

    static int[][] tests = new int[][]{
            new int[]{1, 0, 0, 0, 1}, //2
            new int[]{1, 1, 0, 1, 1}, //1
            new int[]{1, 0, 0, 1, 1}, //1
            new int[]{1, 1, 1, 0, 0}, //2
            new int[]{1, 0, 1, 0, 0, 1, 0, 0, 0, 1}, // 2
            new int[]{1, 0, 1, 0} // 1
    };

    public static void main(String[] args) {
        Arrays.stream(tests).forEach(test -> System.out.println(findBestSeatDist(test)));

    }
    
    public static int findBestSeatDist(int[] seats) {
        if (seats.length < 3) {
            return 1;
        }
        int len = seats.length;
        int leftSeat = 0;
        int rightSeat = 0;
        int i = 0; 
        while (seats[i] != 1) {
            leftSeat++;
            i++;
        } 
        i = len - 1;
        while (seats[i] != 1) {
            rightSeat++;
            i--;
        }
        
        int maxZeroLen = 0;
        int currZeroLen = 0;
        for (int seat : seats) {
            if (seat == 0) {
                currZeroLen++;
            } else {
                if (currZeroLen > maxZeroLen) {
                    maxZeroLen = currZeroLen;
                }
                currZeroLen = 0;
            }
        }
        if (currZeroLen > maxZeroLen) {
            maxZeroLen = currZeroLen;
        }
        return Math.max(--rightSeat, Math.max(--leftSeat, (maxZeroLen - 1) / 2)) + 1;
    }
}
