package com.problems.javafundamentals;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class myRegex{

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new Solution().pattern));
        }

    }
}
class Solution{

	

	public String regex = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	  public String pattern = regex+"\\."+regex+"\\."+regex+"\\."+regex;
	
	
}
