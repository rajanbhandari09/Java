package com.problems.java.fundamentals;

class Arithmetic{
    
    public static String getName(){
        return "Arithmetic";
    }
}
class Adder extends Arithmetic{
    
    
    public int add(int x, int y){
        return x+y;
        
    }
   
}


public class JavaInheritance2 {

	public static void main(String[] args) {
		 Adder X=new Adder();
	        System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());    
	        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");

	}

}
