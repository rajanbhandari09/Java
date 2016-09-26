package com.problems.javafundamentals;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaFileScannerExample {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		Set s = null;
		
		try{
		    in = new FileInputStream("parameter-file.txt");
			BufferedInputStream is = new BufferedInputStream(in);
			Scanner sc = new Scanner(is);
			s = new HashSet();
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				String pattern1 = 
						"\\d+";
				Pattern p = Pattern.compile(pattern1);
				Matcher m = p.matcher(line);
				while(m.find()){
					System.out.println(m.group());
					
					
				}
					
				
				if(line.contains("MIS")){
					
					
					
				}
if(line.contains("SDC")){
					
				}

if(line.contains("cannot_be_together:")){
	
}

if(line.contains("must-have:")){
	
}
			}
			
		}
		
		
		finally{
			in.close();
			
		}
		
		
		
		

	}

}
