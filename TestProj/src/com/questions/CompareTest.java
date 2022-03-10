package com.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTest {

	public static void main(String[] args) {
		List<String> testList = new ArrayList<>();
		testList.add("Mattress");
		testList.add("Toothpaste");
		testList.add("Cheese");
		testList.add("Milk");
		
		
		
		System.out.println(testList);
		Collections.sort(testList, (c1, c2) -> c1.compareTo(c2));
		System.out.println(testList);
		Collections.sort(testList, (c1, c2) -> c1.compareTo(c2)*-1);
		System.out.println(testList);
		
		
	}

}
