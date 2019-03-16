package com.company;

public class asciiChartPrint {

    public static void main(String[] args) {
        int start;
        char cast;
        for (start = 31; start < 255; start++) {
            System.out.print(start);
            cast = (char) start;
            System.out.print(" : " + cast + "\n");
        }


    }
}
