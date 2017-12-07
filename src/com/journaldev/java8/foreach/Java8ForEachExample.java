package com.journaldev.java8.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Ramachandraiah.Nikadi
 * Date : 07/12/2017
 *
 */
public class Java8ForEachExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Creating sample collection
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		
		//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Iterator Value : " + i);
		}
		
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t){
				System.out.println("for Each anonymous class value :: "+ t);
			}
		});
		
		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
	}

}

// Consumer implementation that can be reused.
class MyConsumer implements Consumer<Integer>{

	/* (non-Javadoc)
	 * @see java.util.function.Consumer#accept(java.lang.Object)
	 */
	public void accept(Integer t) {
		System.out.println("Consumer Impl value :: "+ t);
		
	}
	
}