package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @org.junit.jupiter.api.Test
    void sumCounter() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        // вызываем целевой метод:
        long actual = service.sumCounter(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void avgCounter() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        // вызываем целевой метод:
        long actual = service.avgCounter(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maxPurchMonth() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;

        // вызываем целевой метод:
        long actual = StatsService.maxPurchMonth(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void minPurchMonth() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;

        // вызываем целевой метод:
        long actual = StatsService.minPurchMonth(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthLowerAvgCounter() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;

        // вызываем целевой метод:
        long actual = StatsService.monthLowerAvgCounter(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthHigherAvgCounter() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;

        // вызываем целевой метод:
        long actual = StatsService.monthHigherAvgCounter(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
