package ru.owaeshin.arrays;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int freePlaces = 1;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                freePlaces = 0;
            } else {
                freePlaces++;
            }
            if (i == flowerbed.length - 1) {
                freePlaces++;
            }
            if(freePlaces > 2   ) {
                n--;
                freePlaces = 1;
            }
        }
        return n <= 0;
    }
}
