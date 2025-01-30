/**
 * 
 */
package algorithmExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 */
public class Algorithms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> suits = new ArrayList<String>();
		suits.add("Hearts");
		suits.add("Diamonds");
		suits.add("Clubs");
		suits.add("Spades");

		System.out.println(suits.toString());

		Collections.sort(suits);
		System.out.println(suits.toString());

		Collections.sort(suits, Collections.reverseOrder());
		System.out.println(suits);

		List<Integer> nums = new ArrayList<Integer>();
		nums.add(435);
		nums.add(3123);
		nums.add(23);
		nums.add(1092);
		nums.add(1092);
		nums.add(1092);
		
		System.out.println("Min "+Collections.min(nums));
		System.out.println("Max "+Collections.max(nums));
		
		System.out.println("Freq "+Collections.frequency(nums, 1092));
		
		Collections.sort(nums);
		System.out.println("Search "+Collections.binarySearch(nums, 435));
		
	}

}
