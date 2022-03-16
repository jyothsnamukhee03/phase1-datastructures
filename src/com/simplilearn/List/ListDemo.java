package com.simplilearn.List;
import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numberList= new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		numberList.add(60);
		
		for(int index : numberList) {
			System.out.println(index);
		}
		
	}

}
