package com.bl.DAY8.linecomparison;

import java.util.Scanner;

public class UC1 {
    public UC1(int x1, int y1, int x2, int y2) {

    }

    public static void main(String[] args) {
        System.out.println("Length of Two CO-Ordinates are :-");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of X1 Co-Ordinate :");
        int x1 = sc.nextInt();
        System.out.print("Enter Length of Y1 Co-Ordinate :");
        int y1 = sc.nextInt();
        System.out.print("Enter Length of X2 Co-Ordinate :");
        int x2 = sc.nextInt();
        System.out.print("Enter Length of Y2 Co-Ordinate :");
        int y2 = sc.nextInt();

        UC1 compare =new UC1(x1,y1,x2,y2);
        double line = compare.LengthOfLine(x1,y1,x2,y2);
        System.out.println("Length Of Line : "+ line);
    }

    public double LengthOfLine(int x1, int y1, int x2, int y2){
        double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return length;
    }
}
