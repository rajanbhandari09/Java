package com.problems.algorithms.strings;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //in.useDelimiter(":");
        String time = in.next();
        if(time.contains("PM")){
        	
            int hour = Integer.parseInt(time.substring(0,2))+12;
            System.out.println(hour+":"+time.substring(2,8));
        }
        else{
            System.out.println(time.substring(0,8));
            
        }
    }

}
