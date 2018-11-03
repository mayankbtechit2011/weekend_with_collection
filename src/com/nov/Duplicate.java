package com.nov;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {


	public static void main(String[] args) {
		
		List<Integer> numerList = new ArrayList<>();
		
		numerList.add(10);
		numerList.add(20);
		numerList.add(30);
		numerList.add(40);
		numerList.add(50);
		numerList.add(60);
		numerList.add(70);
		numerList.add(80);
		numerList.add(20);
		numerList.add(30);

		List<Integer> list = getlistWithoutDuplicates(numerList);
	
		System.out.println("Distinct List: : "+list);
	}

	public static List<Integer> getlistWithoutDuplicates(List<Integer> list){
		
		List<Integer> distinctList = new ArrayList<>();
		
		for (Integer item: list) {
		
			if(!distinctList.contains(item))
			{
				distinctList.add(item);
			}
		}	

		return distinctList;


	}
}
