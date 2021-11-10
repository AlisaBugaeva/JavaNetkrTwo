package com.mycompany.chapter1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle = sc.nextInt();

        if(angle<0){
            while(angle<0){
                angle+=360;
            }
        }
        else{
            angle %= 360;
        }
        System.out.println(angle+ " degrees");


        System.out.println(Math.floorMod(angle,360)+ " degrees");


    }
}
