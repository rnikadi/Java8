package com.journaldev.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<100; i++) myList.add(i);
		
		//Sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//Using lambda with stream api filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 70);
		
		// Using lambda in foreach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		//Using lambda with stream api filter example
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 70);
				
		// Using lambda in foreach
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
	}

}
