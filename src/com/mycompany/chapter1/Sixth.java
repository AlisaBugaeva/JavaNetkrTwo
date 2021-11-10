package com.mycompany.chapter1;

import java.math.BigInteger;

public class Sixth {
    public static BigInteger factor(int n) {
        if (n < 0) {
            return null;
        }
        BigInteger res = BigInteger.ONE;
        if (n == 0) {
            return res;
        }
        for (int i = 1; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(factor(1000));

    }
}
