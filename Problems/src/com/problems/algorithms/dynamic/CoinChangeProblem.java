package com.problems.algorithms.dynamic;

import java.util.Scanner;

public class CoinChangeProblem {
    public static long makeChange(int[] coins, int money, int index, long[][] map) {
        if(money==0)
            return 1;
         else if(index<0||money<0)
             return 0;
         else if(map[money][index]>0)
             return map[money][index];
         long ways = 0;
         for(int i=0;i*coins[index]<=money;i++){
             int remainingMoney = money - i*coins[index];
             ways += makeChange(coins,remainingMoney,index-1,map);
         }
         map[money][index] = ways;
         return ways;
     }
     
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int m = in.nextInt();
         int coins[] = new int[m];
         long[][] map = new long[n+1][coins.length+1];
         for(int coins_i=0; coins_i < m; coins_i++){
             coins[coins_i] = in.nextInt();
         }
         System.out.println(makeChange(coins, n, coins.length-1,map));
     }
}
