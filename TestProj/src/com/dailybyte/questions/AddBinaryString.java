package com.dailybyte.questions;

public class AddBinaryString {

	public static void main(String[] args) {
		AddBinaryString addBinaryString = new AddBinaryString();
		// System.out.println("100 + 1 return " +
		// addBinaryString.addBinary("100", "1"));
		// System.out.println("11 + 1 return " + addBinaryString.addBinary("11",
		// "1"));
		System.out.println("1010 + 1011 return " + addBinaryString.addBinary("1010", "1011"));

	}

	public String addBinary(String a, String b) {
		return add(a.toCharArray(), b.toCharArray());
	}



	private String add(char[] a, char[] b) {
		String result = "";
		int bSize = b.length - 1;
		int aSize = a.length - 1;
		int cary = 0;
		while (bSize >= 0 && aSize >= 0) {

			if (b[bSize] == a[aSize]) {

				if (cary == 1) {
					result = 1 + result;
				} else {
					result = 0 + result;
				}
				if (b[bSize] == '1') {
					cary = 1;
				} else {
					cary = 0;
				}

			} else if (b[bSize] != a[aSize]) {
				if (cary == 1) {
					result = 0 + result;
					cary = 1;
				} else {
					result = 1 + result;
				}

			}
			bSize--;
			aSize--;
		}
		if (aSize == bSize) {
			if (cary == 1) {
				result = 1 + result;
			}
		} else {
			if (aSize < 0) {
				String s = String.valueOf(b);
				s = s.substring(0, bSize + 1);
				if (cary == 1) {
					char[] c = { '1' };
					result = add(s.toCharArray(), c) + result;
				} else {
					result = s + result;
				}
			} else if (bSize < 0) {
				String s = String.valueOf(a);
				s = s.substring(0, aSize + 1);
				if (cary == 1) {
					char[] c = { '1' };
					result = add(s.toCharArray(), c) + result;
				} else {
					result = s + result;
				}
			}
		}

		return result;
	}
}
