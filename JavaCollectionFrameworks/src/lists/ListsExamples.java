/**
 * 
 */
package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 */
public class ListsExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//list of type arrayList
		List<String> arrList = new ArrayList<String>();
		arrList.add("Belfast");
		arrList.add("Dublin");
		
		//list of type LinkedList
		List<String> lnkList = new LinkedList<String>();
		lnkList.add("London");
		lnkList.add("Cardiff");
	
		showAll(arrList);
		
	
	
	}

	public static void showAll(ArrayList<String> arrayList) {
		for (String s : arrayList) {
			System.out.println(s);
		}
	}
	
	public static void showAll(List<String> list) {
		for (String s : list) {
			System.out.println(s);
		}
	}
	
	public static void showAll(Collection<String> collection) {
		for (String s : collection) {
			System.out.println(s);
		}
	}
	
}
