package com.dailybyte.questions;

public class LengthOfLongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		LengthOfLongestSubstringWithoutRepeatingCharacters longestSubString =new LengthOfLongestSubstringWithoutRepeatingCharacters();
		System.out.println(longestSubString.lengthOfLongestSubstring("abcabcbb"));

	}
	
	 public int lengthOfLongestSubstring(String s) {
	        int n = s.length(), ans = 0;
	        int[] index = new int[256]; // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            i = Math.max(index[s.charAt(j)], i);
	            ans = Math.max(ans, j - i + 1);
	            index[s.charAt(j)] = j + 1;
	        }
	        return ans;
	    }

}
