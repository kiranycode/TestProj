package com.dailybyte.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BackLogDailyByte {

	public static void main(String[] args) {

		//Uncommon Words
		System.out.println("sentence1 = the quick, sentence2 = brown fox, return " +unCommonWords("the quick","brown fox").toString() );
		System.out.println("sentence1 = the tortoise beat the haire,  sentence2 = the tortoise lost to the haire, return " +unCommonWords("the tortoise beat the haire","the tortoise lost to the haire").toString() );
		System.out.println("sentence1 = copper coffee pot, sentence2 = hot coffee pot, return " +unCommonWords("copper coffee pot","hot coffee pot").toString() );
		
		
		
		// Intersection of Numbers
		/*int[] nums1 = { 2, 4, 4, 2 };
		int[] nums2 = { 2, 4 };
		print(findIntersection(nums1, nums2));*/

		// Spot the Difference
		/*
		 * System.out.println("s = foobar, t = barfoot, return "
		 * +spotDifference("foobar","barfoot"));
		 * System.out.println("s = ide, t = idea, return "
		 * +spotDifference("ide","idea"));
		 * System.out.println("s = coding, t = ingcod, return "
		 * +spotDifference("coding","ingcod"));
		 */

		// First Unique Character
		/*
		 * System.out.println("abcabd, return " +firstUniqueChar("abcabd"));
		 * System.out.println("thedailybyte, return "
		 * +firstUniqueChar("thedailybyte"));
		 * System.out.println("developer, return "
		 * +firstUniqueChar("developer")); System.out.println("abab, return "
		 * +firstUniqueChar("abab"));
		 */

		// Valid Anagram
		/*
		 * System.out.println("s = cat, t = tac, return "
		 * +isValidAnagram("cat","tac"));
		 * System.out.println("s = listen, t = silent, return "
		 * +isValidAnagram("listen","silent"));
		 * System.out.println("s = program, t = function, return "
		 * +isValidAnagram("program","function"));
		 */

		// Jewels and Stones
		/*
		 * System.out.println("jewels = abc, stones = ac " +findJewels("abc" ,
		 * "ac")); System.out.println("jewels = Af, stones = AaaddfFf "
		 * +findJewels("Af" , "AaaddfFf"));
		 * System.out.println("jewels = AYOPD, stones = ayopd "
		 * +findJewels("AYOPD" , "ayopd"));
		 */

		// Two sums testing
		/*
		 * int nums [] ={1, 3, 8, 2}; 
		 * int nums1 [] ={3, 9, 13, 7}; 
		 * int nums2 []={4, 2, 6, 5, 2};
		 *  System.out.println(twoSum( nums,10));
		 * System.out.println(twoSum( nums1,8));
		 *  System.out.println(twoSum(nums2,4));
		 */

	}
	
	private static List unCommonWords(String string, String string2) {
		
		String str [] = (string2+" "+string).split(" ");
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		for(String s:str ){
			wordMap.put(s, wordMap.getOrDefault(s,0)+1);
		}
		
		
		List<String> list = new ArrayList<String>();
		
		for(String s:wordMap.keySet() ){
			if(wordMap.get(s)==1){
				list.add(s);				
			}
		}
		
		return list;
	}

	private static Set unCommonWords1(String string, String string2) {
		Set<String> firstString = new HashSet<String>();
		Set<String> secondString = new HashSet<String>();
		String str [] = string.split(" ");
		for(String s:str ){
			firstString.add(s);
		}
		String str2 [] = string2.split(" ");
		for(String s:str2 ){
			secondString.add(s);
		}
		
		Set<String> unCommon = new HashSet<String>();
		
		for(String s:secondString ){
			if(firstString.contains(s)){
				firstString.remove(s);				
			}else{
				unCommon.add(s);
			}
		}
		unCommon.addAll(firstString);
		return unCommon;
	}

	private static void print(Set<Integer> findIntersection) {
		for(int i : findIntersection){
			System.out.print(i +", ");
		}
		
	}

	private static Set findIntersection(int[] nums1, int[] nums2) {
		Set<Integer> num1Set = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			num1Set.add(nums1[i]);
		}

		Set<Integer> intersectionSet = new HashSet<Integer>();
		for (int j = 0; j < nums2.length; j++) {
			if(num1Set.contains(nums2[j])){
				intersectionSet.add(nums2[j]);
			}
		}
		
		return intersectionSet;

	}

	private static char spotDifference(String s, String t) {

		if (s.length() == t.length()) {
			return 0;
		}

		return (char) (getCharSum(t) - getCharSum(s));

	}

	private static int getCharSum(String t) {
		char c[] = t.toCharArray();
		int cnt = 0;
		for (int i = 0; i < c.length; i++) {
			cnt = cnt + c[i];
		}
		return cnt;
	}

	private static int firstUniqueChar1(String s) {
		char c[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(c[i]) == s.lastIndexOf(c[i])) {
				return i;
			}
		}
		return -1;
	}

	private static int firstUniqueChar(String s) {
		int[] count = new int[256];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i)] == 1) {
				return i;
			}
		}

		return -1;
	}

	private static boolean isValidAnagram1(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		StringBuilder s = new StringBuilder(s2);
		char c[] = s1.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int index = s.indexOf(c[i] + "");
			if (index >= 0) {
				s.deleteCharAt(index);
			} else {
				return false;
			}
		}

		return true;
	}

	private static boolean isValidAnagram2(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		int count = 0;
		for (int i = 0; i < c1.length; i++) {
			count = count + c1[i] - c2[i];
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}

	}

	private static int findJewels(String jewels, String stones) {
		char[] c = stones.toCharArray();
		int cnt = 0;
		for (int i = 0; i < c.length; i++) {
			if (jewels.contains(c[i] + "")) {
				cnt++;
			}
		}
		return cnt;
	}

	private static boolean twoSum(int[] nums, int sum) {
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int target = sum - nums[i];
			if (numberMap.containsKey(target)) {
				System.out.println(nums[i] + " +  " + target + "  =  " + sum);
				return true;
			} else {
				numberMap.put(nums[i], i);
			}

		}

		return false;
	}

}
