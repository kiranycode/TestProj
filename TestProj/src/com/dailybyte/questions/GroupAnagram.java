package com.dailybyte.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		GroupAnagram groupAnagrams = new GroupAnagram();
		List<List<String>> reultLsit = groupAnagrams
				.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });

		for (List<String> l : reultLsit) {
			System.out.println(l);
		}

	}	
	

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> testList = new HashMap();
		List<List<String>> reultLsit = new ArrayList();
		for (String s : strs) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String key = String.valueOf(c);
			if (testList.containsKey(key)) {
				List<String> tmpList = testList.get(key);
				tmpList.add(s);
				testList.put(key, tmpList);
			} else {
				List<String> tmpList = new ArrayList<String>();
				tmpList.add(s);
				testList.put(key, tmpList);
			}
		}
		for (String s : testList.keySet()) {
			reultLsit.add(testList.get(s));
		}

		return reultLsit;
	}

}
