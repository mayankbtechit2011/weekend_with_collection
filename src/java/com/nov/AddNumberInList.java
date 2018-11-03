package java.com.nov;

import java.util.ArrayList;
import java.util.List;

public class AddNumberInList {
	
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
		numerList.add(90);
		numerList.add(100);

		//Insert say 55 at right place
		List<Integer> updatedList = insertInListSequential(numerList, 55);
		System.out.println("Updated List: "+updatedList);
	}

	public static  List<Integer> insertInListSequential(List<Integer> list, int number) {
		int position=0;
		for (int inc = 0; inc < list.size(); inc++) {
			if(number < list.get(inc)) {
				position = inc;
				break;
			}
		}

		if(position == 0 && number!=0)
		{
			position = list.size();
		}
		list.add(position,number);

		return list;
	}
}
