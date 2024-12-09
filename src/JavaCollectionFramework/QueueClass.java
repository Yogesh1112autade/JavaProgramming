package JavaCollectionFramework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
	public static void main(String[] args) {
		// Here use priority Queue
		//Queue Que=new PriorityQueue();
			Queue Que=new LinkedList();
		// Adding Elements add() and offers methods
		Que.add('A');
		Que.add('B');
		Que.add('C');
		Que.offer('C');
		System.out.println(Que);
		
		// get head Element element()  peek()
		//System.out.println(Que.element());// Return head element if Queue has empty return Exception
		//System.out.println(Que.peek());// Return head element if Queue has empty return NUll
		
		// Return & remove element from Queue remove()   poll()
		System.out.println(Que.remove());// Return element and remove if Queue has empty return Exception
		System.out.println(Que);
		
		System.out.println(Que.poll());// Return element and remove if Queue has empty return NULL
		System.out.println(Que);
		
		
		
	}

}
