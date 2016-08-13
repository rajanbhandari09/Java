package com.problems.algorithms;

import java.util.Scanner;

public class MaximizingXOR{

static int maxXor(int l, int r) {
int max = -1;
        int xorval = 0;
        for(int i=l;i<r+1;i++){
            for(int j=i;j<r+1;j++){
                
                xorval = i^j;
                if(xorval>max)
                    max=xorval;
            }
            
            
        }
return max;
    }



 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }

}