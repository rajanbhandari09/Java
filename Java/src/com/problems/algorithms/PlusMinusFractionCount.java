package com.problems.algorithms;

import java.util.Scanner;

public class PlusMinusFractionCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int countpositive =0;
        int countnegative= 0;
        int countzero =0;
        double fractionpositive;
        double fractionnegative;
        double fractionzero;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
    for(int i = 0;i<n;i++){
    if(arr[i]>0)
        countpositive++;
       else if(arr[i]<0)
        countnegative++;
        else
        countzero++;
        
                
    }
        
       /* BigDecimal b1 = new BigDecimal(countpositive);
        BigDecimal b2 = new BigDecimal(countnegative);
        BigDecimal b3 = new BigDecimal(countzero);
            BigDecimal b4 = new BigDecimal(n);
            System.out.println(b1.divide(b4,7,RoundingMode.CEILING).toString());
        System.out.println(b2.divide(b4,7,RoundingMode.CEILING).toString());
        System.out.println(b3.divide(b4,7,RoundingMode.CEILING).toString());
        */
fractionpositive = (double)countpositive/n;
        fractionnegative = (double)countnegative/n;
        fractionzero = (double)countzero/n;
        System.out.println(fractionpositive);
    System.out.println(fractionnegative);
        System.out.println(fractionzero);

	}

}
