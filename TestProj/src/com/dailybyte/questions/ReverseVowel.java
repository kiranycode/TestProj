package com.dailybyte.questions;

public class ReverseVowel {

	public static void main(String[] args) {
		ReverseVowel reverseVowel = new ReverseVowel();

		System.out.println(reverseVowel.reverseVowels("hello"));
		// System.out.println(reverseVowel.reverseVowels("leetcode"));
		// System.out.println(reverseVowel.reverseVowels("aA"));
		// System.out.println(reverseVowel.reverseVowels("Euston saw I was not
		// Sue."));
		System.out.println(reverseVowel.reverseVowels("Tide-net safe, soon, Allin. A manilla noose fastened it."));

	}

	public String reverseVowels(String st) {

		char c[] = st.toCharArray();
		int j = st.length() - 1;
		boolean findLeft = false;
		boolean findRight = false;
		int i = 0;
		while (i < j) {

			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E'
					|| c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {
				findLeft = true;
			}

			if (c[j] == 'a' || c[j] == 'e' || c[j] == 'i' || c[j] == 'o' || c[j] == 'u' || c[j] == 'A' || c[j] == 'E'
					|| c[j] == 'I' || c[j] == 'O' || c[j] == 'U') {
				findRight = true;
			}

			if (findLeft && findRight) {
				c = swap(c, i, j);
				findRight = false;
				findLeft = false;
			}

			if (!findLeft) {
				i++;
			}
			if (!findRight) {
				j--;
			}
		}
		return String.valueOf(c);

	}

	public String reverseVowels1(String st) {

		String s = "aeiouAEIOU";
		int j = st.length() - 1;
		boolean findLeft = false;
		boolean findRight = false;
		int i = 0;
		while (i < j) {
			if (s.contains(st.charAt(i) + "")) {
				findLeft = true;
			}

			if (s.contains(st.charAt(j) + "")) {
				findRight = true;
			}

			if (findLeft && findRight) {
				st = swap(st.toCharArray(), i, j, "");
				findRight = false;
				findLeft = false;
			}

			if (!findLeft) {
				i++;
			}
			if (!findRight) {
				j--;
			}
		}
		return st;

	}

	private String swap(char[] charArray, int r, int l, String s) {
		char temp = charArray[r];
		charArray[r] = charArray[l];
		charArray[l] = temp;
		return String.valueOf(charArray);
	}

	private char[] swap(char[] charArray, int r, int l) {
		char temp = charArray[r];
		charArray[r] = charArray[l];
		charArray[l] = temp;
		return charArray;
	}
}
