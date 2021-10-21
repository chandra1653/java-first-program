package com.h2;

import java.time.LocalDate;
import java.time.YearMonth;

public class SavingsCalculator {
    private float[] debits;
    private float[] credits;

    SavingsCalculator(float[] credits, float[] debits) {
        this.credits = credits;
        this.debits = debits;
    }

    private float sumOfCredits() {
        float sum = 0.0f;
        for (int i = 0; i < credits.length; i++) {
            sum += credits[i];
        }
        return sum;
    }

    private float sumOfDebits() {
        float sum = 0.0f;
        for (int j = 0; j < debits.length; j++) {
            sum += debits[j];
        }
        return sum;
    }

    private static int remainingDaysInMonth(LocalDate date) {
        YearMonth yearMonth = YearMonth.of(date.getYear(), date.getMonth());
        int totalDaysInMonth = yearMonth.lengthOfMonth();
        int remainingDays = totalDaysInMonth - date.getDayOfMonth();
        return remainingDays;
    }

    public float calculate() {
        return sumOfCredits() - sumOfDebits();
    }

    public static void main(String[] args) {

        final String[] creditsAsString = args[0].split(",");
        final String[] debitsAsString = args[1].split(",");
        float[] credits = new float[creditsAsString.length];
        float[] debits = new float[debitsAsString.length];
        for (int i = 0; i < credits.length; i++) {
            credits[i] = Float.parseFloat(creditsAsString[i]);
        }
        for (int j = 0; j < debits.length; j++) {
            debits[j] = Float.parseFloat(debitsAsString[j]);
        }
        final SavingsCalculator calculator = new SavingsCalculator(credits, debits);
        float netSavings = calculator.calculate();
        System.out.println("Net Savings = " + netSavings + ", remaining days in month = " + remainingDaysInMonth(LocalDate.now()));
    }
}
