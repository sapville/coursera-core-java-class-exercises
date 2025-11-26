package com.lq.exercises;

public class Lab2 {

	public static void main(String[] args) {
		int width;
        int height;
        int area;
        double radius = 10;
        double pi = 3.14;
        boolean result = true;

        printOutMonths();

        width = 8;
        height = 12;
        area = 96;

        System.out.printf("The value of width is %d%n", width);
        System.out.printf("The value of height is %d%n", height);
        System.out.printf("The value of area is %d%n", area);
        System.out.printf("The value of radius is %.1f%n", radius);
        System.out.printf("The value of pi is %.2f%n", pi);
        System.out.printf("The value of result is %b%n", result);

        System.out.println();

        printOutMonths();

	}

    static void printOutMonths() {
        String[] monthNames = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int[] daysInMonths = getDaysInMonths();

        for (int i = 0; i < monthNames.length; i++) {
            System.out.printf("%s has %d days.%n", monthNames[i], daysInMonths[i]);
        }
    }

    static int[] getDaysInMonths() {
        int[] daysInMonths = new int[12];
        for (int i = 0; i < daysInMonths.length; i++) {
            switch (i) {
                case 0: case 2: case 4: case 6: case 7: case 9: case 11:
                    daysInMonths[i] = 31;
                    break;
                case 1:
                    daysInMonths[i] = 28;
                    break;
                default:
                    daysInMonths[i] = 30;
            }
        }
        return daysInMonths;
    }

}
