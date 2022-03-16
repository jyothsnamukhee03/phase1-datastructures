package com.simplilearn.Arrays;
import java.util.*;
public class ArrayOrderStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] items = {-15,20,3,50,26,24,78,90};
		int position = 3;
		int response = findKthSmallest(items,position);
		System.out.println("The position "+position+" Smallest element is "+response);
		int response1 = findKthLargest(items,position);
		System.out.println("The position "+position+" Largest element is "+response1);
	}
	
	private static int findKthSmallest(int [] items,int position) {
		
		// Arrange the array in ascending order
		
		Arrays.sort(items);
		
		// Return Kth Elemnt
		
		
		return items[position-1];
	}

	
	private static int findKthLargest(int [] items,int position) {
		
			// Arrange the array in ascending order
		
			Arrays.sort(items);
		
			// Return Kth Elemnt
		
		
			return items[items.length-position];
	}


}
