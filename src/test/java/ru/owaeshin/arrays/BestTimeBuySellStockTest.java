package ru.owaeshin.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeBuySellStockTest {

    @Test
    void maxProfit1() {
        BestTimeBuySellStock bestTimeBuySellStock = new BestTimeBuySellStock();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(5, bestTimeBuySellStock.maxProfit(prices));
    }

    @Test
    void maxProfit2() {
        BestTimeBuySellStock bestTimeBuySellStock = new BestTimeBuySellStock();
        int[] prices = new int[]{7, 6, 4, 3, 1};
        assertEquals(0, bestTimeBuySellStock.maxProfit(prices));
    }

}