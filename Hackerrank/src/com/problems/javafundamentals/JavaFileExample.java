package com.problems.javafundamentals;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaFileExample {

	public static void main(String[] args) throws IOException {
		byte[] buffer = new byte[1024];
		FileInputStream is = null;
		FileOutputStream os = null;
		
		try{
			is = new FileInputStream("parameter-file.txt");
			os = new FileOutputStream("TestOutput.txt");
			BufferedInputStream in = new BufferedInputStream(is);
			BufferedOutputStream out = new BufferedOutputStream(os);
			int len;
			while((len = in.read(buffer))!=-1){
				
				
				out.write(buffer,0,len);
				out.flush();
				
				
				
			}
				
				
			
		} 
		
		finally{
			if(is!=null)
				
					is.close();
				
			if(os!=null)
				
					os.close();
				
			
		}
		
		
		
		

	}

}
