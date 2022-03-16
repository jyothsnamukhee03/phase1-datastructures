package com.simplilearn.Arrays;

import java.util.Arrays;

public class ArrayRotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] items = {10,20,30,40,50,60,70,80};
		
		System.out.println("The array before rotation: ");
		System.out.println(Arrays.toString(items));
		
		rotateLeft(items,3);
		System.out.println("==========================");
		System.out.println("The array After rotation: ");
		System.out.println(Arrays.toString(items));
		
		
		
	}
	
	private static void rotateLeft(int[] items,int position) {
		
		// create a temp array
		
		int temp[] = new int[position];
		
		// copy elements into  temp array based on position or rotate count
		
		for(int index = 0;index < position; index++) {
			temp[index] = items[index];
			
		}
		
		// move / shify actual array elemnts to forward direction
		
		for(int index = position; index < items.length;index++) {
			
			items[index-position] = items[index];
			
		}
		
		//  copy the temp element in actual array
		for(int index = 0;index < position;index++) {
			items[index+items.length - position] = temp[index];
		}
		
	}

}
