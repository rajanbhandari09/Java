package com.problems.collections.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashMapSorting {

	public static List sortByValues(Map Employees){
		
		List<Map.Entry<Integer,String>> EmployeeListSortedByValues = new ArrayList<>(Employees.entrySet());
		
		/*//Using Anonymous Class
		Collections.sort(EmployeeListSortedByValues, new Comparator<Map.Entry<Integer,String>>(){
			public int compare(Map.Entry<Integer,String> e1, Map.Entry<Integer,String> e2){
				return -e1.getValue().compareTo(e2.getValue());
							
			}});*/
		
		//Using Lambda Expressions
		Collections.sort(EmployeeListSortedByValues, (Map.Entry<Integer, String> e1, Map.Entry<Integer, String> e2)->
			-e1.getValue().compareTo(e2.getValue()));
		
		return EmployeeListSortedByValues;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfRecords = sc.nextInt();
		Map<Integer,String> Employees = new HashMap<>();
		
		for(int i=0;i<numberOfRecords;i++){
			
			Employees.put(sc.nextInt(), sc.next());
			
		}
		
		List<Map.Entry<Integer, String>> EmployeeListSortedByValue = sortByValues(Employees);
		
		//Print Employees sorted by descending order of names
		for(Map.Entry<Integer, String> employee: EmployeeListSortedByValue){
			System.out.println(employee.getKey()+": "+employee.getValue());
			
		}

	}

}
