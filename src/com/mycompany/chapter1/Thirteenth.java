package com.mycompany.chapter1;

import java.util.Arrays;

public class Thirteenth {
    public static void main(String[] args) {
        int[] mas=new int[49];
        int[] ans=new int[6];
        for (int i=0;i<49;i++){
            mas[i]=i+1;
        }
        for(int i = 1; i<=6;i++){
           int index =1+(int)(Math.random()*(49-i));
            //System.out.println(index);
           ans[i-1]=mas[index];
            for(int j=index;j<49-i;j++){
                mas[j]=mas[j+1];
            }

        }
        Arrays.sort(ans);
        for(int i = 0; i<6;i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
