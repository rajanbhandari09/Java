package com.problems.java.collections.map;

import java.util.ArrayList;
import java.util.List;

class HashEntry<K,V>{
	private K key;
	private V value;
	private HashEntry<K,V> next;
	
	HashEntry(K key, V value){
		this.key = key;
		this.value = value;
		
		
	}
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public HashEntry<K, V> getNext() {
		return next;
	}

	public void setNext(HashEntry<K, V> next) {
		this.next = next;
	}

	
	
	
	
	
	
	
}

class HashTable<K,V>{
	ArrayList<HashEntry<K,V>>[] array;
	int arraySize;
	int size;
	
	
	HashTable(int numberOfBuckets){
		arraySize = numberOfBuckets;
		array = new ArrayList[arraySize];
		size = 0;
		for(int i=0;i<arraySize;i++){
			array[i] = new ArrayList<HashEntry<K,V>>();
			
		}
		
		
		
		
		
	}
	
	//helper function for calculating bucket position in array
	private int calculateIndex(K key){
		return key.hashCode()%arraySize;
		
		
		
	}
	
	public void put(K key, V value){
		int arrayPosition = this.calculateIndex(key);
		ArrayList<HashEntry<K,V>> bucket = array[arrayPosition];
		HashEntry<K,V> data = null;
		if(bucket.isEmpty()){
			data = new HashEntry(key,value);
			data.setNext(null);
			bucket.add(data);
			size++;
			
			
		}
		
		else{
			for(HashEntry<K,V> entry: bucket){
				if(entry.getKey().equals(key)){
					entry.setValue(value);
					data = entry;
					break;
				}
				
				
			}
			
			if(data==null){
				data = new HashEntry(key,value);
				data.setNext(null);
				bucket.add(data);
				size++;
			}
			
			
			
			
		}
		
		
		
	}
	
	public V get(K key){
		int arrayPosition = this.calculateIndex(key);
		ArrayList<HashEntry<K,V>> bucket = array[arrayPosition];
		
		for(HashEntry<K,V> entry: bucket){
			if(entry.getKey().equals(key)){
				return entry.getValue();
			}
			
			
		}
		
		return null;
	}
	
	public int size(){
		return size;
	}
	
	
	
	
	
}



public class HashTableImplementation {

	public static void main(String[] args) {
		HashTable<Integer,String> myTable = new HashTable<>(10);
		myTable.put(1, "rajan");
		System.out.println(myTable.get(1));
		System.out.println(myTable.size());
		
		
		
	}

}
