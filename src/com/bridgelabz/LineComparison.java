package com.bridgelabz;

public class LineComparison {static int x1;
    static int y1;

    static int x2;
    static int y2;

    public static void main(String[] args) {
        System.out.println("Welcome to line comparision");
        x1 = 2;
        y1 = -5;

        x2 = 3;
        y2 = 6;

        int length1 = (int) Math.sqrt( (Math.pow((x1-x2),2) + Math.pow((y1-y2),2)) );
        System.out.println("Length of the line : " + length1);

        x1 = 3;
        y1 = 6;

        x2 = 2;
        y2 = -5;

        int length2 = (int) Math.sqrt( (Math.pow((x1-x2),2) + Math.pow((y1-y2),2)) );
        System.out.println("Length of the line : " + length2);

        if(length1 > length2) {
            System.out.println("Length 1 is grater than Length 2");
        }else if(length1 < length2) {
            System.out.println("Length 2 is greater than Length 1");
        }else
            System.out.println("Both Length are same");

    }

}








