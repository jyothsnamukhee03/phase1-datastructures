package com.simplilearn.Arrays;

public class ArrayDSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare an array
		
		int[] numbers = new int[6];
		numbers[0] = 30;
		numbers[1] = 40;
		numbers[2] = 50;
		
		int[] items = {10,20,30,40,50,60};
		
		display(items);
	}
	
	private static void display(int[] items) {
		// for loop with counter
		for(int index = 0;index < items.length;index++) {
			System.out.println("Th element at index "+index+" is "+ items[index]);
		}
		
		// enhanced for loop
		for(int item : items) {
			System.out.println("The value is "+item);
		}
		
		
	}

}
