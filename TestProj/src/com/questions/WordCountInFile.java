package com.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCountInFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		Map<String, Integer> countByWords = new TreeMap<String, Integer>();
	    Scanner s = new Scanner(new File("C:\\snowflakes\\wordcountsample.txt"));
	    while (s.hasNext()) {
	        String next = s.next().toLowerCase();
	        Integer count = countByWords.get(next);
	        if (count != null) {
	            countByWords.put(next, count + 1);
	        } else {
	            countByWords.put(next, 1);
	        }
	    }
	    s.close();
	    
	    
	    for (String key : countByWords.keySet()) {
			System.out.println( countByWords.get(key)+ "  "+key);
		}
			

	}

}
