package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        long[] purchases = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        sumCounter(purchases);
        avgCounter(purchases);
        maxPurchMonth(purchases);
        minPurchMonth(purchases);
        monthLowerAvgCounter(purchases);
        monthHigherAvgCounter(purchases);
    }

    public static long sumCounter(long[] purchases) {
        long sum = 0;
        for (long purch : purchases) {
            sum += purch;
        }
        return sum;
    }

    public static long avgCounter(long[] purchases) {
        return (sumCounter(purchases)/purchases.length);
    }

    public static long maxPurchMonth(long[] purchases) {
        int monthNum = 0;
        long maxPurch = purchases[0];
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] >= maxPurch) {
                maxPurch = purchases[i];
                monthNum = i;
            }
        }
        return monthNum;
    }

    public static long minPurchMonth(long[] purchases) {
        long minMonth = purchases[0];
        int monthNum = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] <= minMonth) {
                minMonth = purchases[i];
                monthNum = i;
            }
        }
        return monthNum;
    }

    public static long monthLowerAvgCounter(long[] purchases) {
        int monthCounter = 0;
        for (long purch : purchases) {
            if (purch < (avgCounter(purchases))) {
                monthCounter++;
            }
        }
        return monthCounter;
    }

    public static long monthHigherAvgCounter(long[] purchases) {
        int monthCounter = 0;
        for (long purch : purchases) {
            if (purch > (avgCounter(purchases))) {
                monthCounter++;
            }
        }
        return monthCounter;
    }
}

