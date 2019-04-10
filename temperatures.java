package com.company;

public class temperatures {

//    public static double averageFinder(int[][] temps, int rowOrColumn, int column, int row) {
//        int total = 0;
//        int count = 0;
//        for (count = 0; count < rowOrColumn; count++) {
//            total = total + temps[row][column];
//        }
//        double sum = total/rowOrColumn;
//        return sum;
//    }

    public static double dayAverage(int[][] temps, int column) {
        //for day average, cycle through each row for the same column
        int total = 0;
        for (int row = 0; row < 4; row++) {
            total = total + temps[row][column];
        }
        double sum = total/4;
        return sum;
    }

    public static double timeAverage(int[][] temps, int row) {
        //for time average, cycle through each column on the same row
        int total = 0;
        for (int column = 0; column < 7; column++) {
            total = total + temps[row][column];
        }
        double sum = total/7;
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("Temperature calculator\n" + "\nProvided temperatures:");

    int[][] temps = {
            {68, 70, 76, 70, 68, 71, 75},
            {76, 76, 87, 84, 82, 75, 83},
            {73, 72, 81, 78, 76, 73, 77},
            {64, 65, 69, 68, 70, 74, 72}
          };

    //times are rows
    String[] times = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
    //days are columns
    String[] days = {"Sun: ", "Mon: ", "Tues: ", "Wed: ", "Thurs: ", "Fri: ", "Sat: "};


        for (int row = 0; row < 4; row++) {
            System.out.print(times[row]);
            for (int column = 0; column < 7; column++) {
                System.out.print(temps[row][column] + " ");
            }
            System.out.print("\n");
        }


        System.out.println("\nBased on this data, the following are the average temperatures for the week:\n");

        for(int i=0; i<4; i++) {
            System.out.println(times[i] + timeAverage(temps, i));
        }
        System.out.println("\n");

        for(int i=0; i<7;i++) {
            System.out.println(days[i] + dayAverage(temps, i));
        }

        System.out.println("\nThe final average temperature for the week is:\n");
        int totalAverage = 0;
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 7; column++) {
                totalAverage = totalAverage + temps[row][column];
            }
        }
        double sum = totalAverage/28;
        System.out.println("Overall: " + sum);

    }
    }


    