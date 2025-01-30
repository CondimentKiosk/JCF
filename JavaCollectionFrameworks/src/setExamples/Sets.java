/**
 * 
 */
package setExamples;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 */
public class Sets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<String>set = new HashSet<String>();
		set.add("red");
		set.add("green");
		set.add("blue");
		
		for (String colour : set) {
			System.out.println(colour);
		}
		
		//duplicated green
		set.add("green");
		System.out.println();
		
		//2nd green not present
		for (String colour : set) {
			System.out.println(colour);
		}
		
		SortedSet<String> sortedSet = new TreeSet<String>();
		sortedSet.add("Zindane");
		sortedSet.add("Messi");
		sortedSet.add("Pele");
		System.out.println();
		for (String playerName : sortedSet) {
			System.out.println(playerName);
		}
		
		System.out.println(sortedSet.first());
		//will return true
		System.out.println(sortedSet.remove("Messi"));
		
	}

}
