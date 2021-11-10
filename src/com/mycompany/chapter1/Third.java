package com.mycompany.chapter1;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largestNumber1= (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Самое большое число : "+largestNumber1);


        int largestNumber2= (a > b) ? Math.max(a,c) : Math.max(b,c);
        System.out.println("Самое большое число с помощью Math.max :  " + largestNumber2 );
    }
}
