package Lec_18;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		int a = 0;
//Add Function
//.add() method is used to add elements in List; 
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);

//Add And Update at a index in list;

		list.add(3, 50);
		list.add(1, 50);
		System.out.println(list);

//Remove Function
//.remove() method is used to remove element at a point index from the list;
		list.remove(0);
		System.out.println(list);

//Get Function
		// .get() method is used to get a particular index value;
		System.out.println(list.get(3));

//Find Length
		System.out.println(list.size());

		// Set Function
		// Update
		list.set(1, 30);
		System.out.println(list);

		// Print all element
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// reverse print
		Collections.reverse(list);
		System.out.println(list);

		// enhanced for loop
		for (int val : list) {
			System.out.print(val + " ");
		}
	}

}
