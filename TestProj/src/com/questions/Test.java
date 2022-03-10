package com.questions;

public class Test {
	public static void main(String[] args) {

		String s = "loveleetcode";

		System.out.println(firstUniqChar(s));
		System.out.println(firstUniqChar(""));
		System.out.println(firstUniqChar("cc"));
		System.out.println(test("abc", "bce"));

	}

	public static int firstUniqChar(String s) {
		int k = -1;
		char c[] = s.toCharArray();
		if (s != null && s.trim().length() > 0) {

			for (int i = 0; i < s.length(); i++) {
				if(s.indexOf(c[i])==s.lastIndexOf(c[i])){
					return i;
				}

			}
		}
		return -1;
	}
	
	private static int test(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return -1;
        }
        for (int i = 0; i < str1.length(); i++) {
            boolean found = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt((i + j) % str1.length()) != str2.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }
}
