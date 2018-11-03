package java.com.nov;

import java.util.ArrayList;
import java.util.List;

public class FindDistinctNumbers {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		numberList.add(60);
		numberList.add(70);
		numberList.add(80);
		numberList.add(20);
		numberList.add(30);

		List<Integer> list = getListWithoutDuplicates(numberList);
		System.out.println("Distinct List: : " + list);
	}

	public static List<Integer> getListWithoutDuplicates(List<Integer> list) {
		List<Integer> distinctList = new ArrayList<>();
		for (Integer item : list) {
			if (!distinctList.contains(item)) {
				distinctList.add(item);
			}
		}

		return distinctList;
	}
}
