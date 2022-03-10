package com.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inputScanner = new Scanner(new File("/Users/text.txt")).useDelimiter("[^a-zA-Z]+");
		Map<String, Integer> map = new HashMap<String, Integer>();
		while (inputScanner.hasNext()) {
			String word = inputScanner.next();
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}

		List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>();

		Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
				return a.getValue().compareTo(b.getValue());
			}
		});

		for (int i = 0; i < map.size(); i++) {
			//System.out.println(entries.get(entries.get(entries.size() - i - 1).getValue() + " " + entries.size() - i - 1).getKey());
		}
	}

}
