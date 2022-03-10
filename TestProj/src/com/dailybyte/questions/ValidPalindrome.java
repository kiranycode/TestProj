package com.dailybyte.questions;

public class ValidPalindrome {

	public static void main(String[] args) {
		ValidPalindrome validPalindrome = new ValidPalindrome();
		System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(validPalindrome.isPalindrome("race a car"));
		System.out.println(validPalindrome.isPalindrome("0P"));
		System.out.println(validPalindrome.isPalindrome("a.b,."));

	}

	

	public boolean isPalindrome(String s) {
		char c[] = s.toLowerCase().toCharArray();
		boolean polyndrome = true;
		int r = s.length() - 1;
		int l = 0;
		while (l < r) {
			int cl = c[l];
			int cr = c[r];
			if ((cl > 96 && cl < 123) || (cl >= 48 && cl <= 57)) {
				if ((cr > 96 && cr < 123) || (cr >= 48 && cr <= 57)) {
					if (cl != cr) {
						return false;
					} else {
						r--;
						l++;
					}
				} else {
					r--;
				}
			} else {
				l++;
			}

		}

		return polyndrome;
	}

	
	public boolean isPalindrome2(String s) {
		if (s == null || s.length() == 0)
			return true;
		int l = 0, r = s.length() - 1;
		while (l < r) {
			if (Character.isLetterOrDigit(s.charAt(l)) && Character.isLetterOrDigit(s.charAt(r))) {
				if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
					return false;
				}
			} else if (Character.isLetterOrDigit(s.charAt(l))) {
				r--;
				continue;
			} else if (Character.isLetterOrDigit(s.charAt(r))) {
				l++;
				continue;
			}
			l++;
			r--;
		}
		return true;
	}
}
