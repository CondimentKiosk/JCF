/**
 * 
 */
package queueExamples;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 
 */
public class Queues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int time = 10;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = time; i >=0; i--) {
			queue.add(i);
		}
		
		System.out.println(queue.toString());
		
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Queue<Double> q = new PriorityQueue<Double>();
		
		q.add(10.1);
		q.add(3.3);
		q.add(5.2);
		System.out.println("Queue order: "+q.toString());
		int loop =1;
		while(loop<=q.size()) {
			System.out.println("Peek "+q.peek());
			q.remove();
		}
	}

}
