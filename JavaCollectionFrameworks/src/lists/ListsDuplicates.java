package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListsDuplicates {

	public static void main(String[] args) {

		List<Integer> arrList = new ArrayList<Integer>();
		List<Integer> lnkList = new LinkedList<Integer>();

		for (int i = 0; i < 11; i++) {
		arrList.add(new Random().nextInt(1, 6));
		}
		
		System.out.println(arrList);

		for (int i = 0; i < 11; i++) {
			lnkList.add(new Random().nextInt(1, 6));
		}
		
		System.out.println(lnkList);
		
		removeDuplicates(arrList, lnkList);
		System.out.println(arrList);
	}

	
	public static void removeDuplicates(Collection<Integer>originalList, Collection<Integer>listToRemove) {
		
		for (Integer intToRemove : listToRemove) {
			if(originalList.contains(intToRemove)) {
				originalList.remove(intToRemove);
			}
		}
	}
	
}
