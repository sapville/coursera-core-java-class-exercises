package com.lq.exercises;

public class Lab3 {

    public static void main(String[] args) {

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String dayOfWeek : daysOfWeek) {
            System.out.println(dayOfWeek);
        }

        System.out.println();

        for (int i = daysOfWeek.length - 1; i >= 0 ; i--) {
            System.out.println(daysOfWeek[i]);
        }

        System.out.println();

        final int FROM = 1;
        final int TO = 20;

        int counter = FROM - 1;
        while (counter++ < TO) {
            if (counter % 2 != 0) continue;

            System.out.println(counter);
        }

        System.out.println();

        final int TO_2 = 100;
        final int SKIP_FROM = 50;
        final int SKIP_TO = 60;

        for (int i = FROM; i <= TO_2 ; i++) {
            if (i >= SKIP_FROM && i <= SKIP_TO) continue;

            System.out.println(i);
        }

        System.out.println();
        Lab2.printOutMonths();

        printOutMonth(daysOfWeek, Lab2.getDaysInMonths()[1], 6, "February");
        printOutMonth(daysOfWeek, Lab2.getDaysInMonths()[2], 6, "March");
        printOutMonth(daysOfWeek, Lab2.getDaysInMonths()[3], 2, "April");
    }

    private static void printOutMonth(String[] daysOfWeek, int numberOfDays, int firstDayNumber, String monthName) {
        System.out.println("\n\n" + monthName);
        for (String day : daysOfWeek) {
            System.out.print(day.substring(0, 3) + "\t");
        }

        System.out.println();

        for (int i = 0; i < daysOfWeek.length * 6; i++) {
            int date = 0;
            if (i >= firstDayNumber - 1) {
                date = i - firstDayNumber + 2;
            }

            System.out.print((date == 0 ? "" : date) + "\t");

            if (date > numberOfDays - 1) {
                break;
            } else if ((i + 1) % 7 == 0 ) {
                System.out.println();
            }
        }



    }

}
