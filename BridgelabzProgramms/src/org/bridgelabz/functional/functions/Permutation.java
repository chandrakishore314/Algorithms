package org.bridgelabz.programms.functions;

public class Permutation {
	public static String swapString(String a, int i, int j) {
		char[] b = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}

	public static void main(String[] args) {
		String str = "ABC";
		int len = str.length();
		System.out.println("All the permutations of  length " + len + " the string are: ");
		
		String strRec[] = generatePermutationRecursive(str, 0, len);
		String[] striter = generaepermutationIterative(str, 0, len);
		for (int i = 0; i < strRec.length; i++) {
			System.out.print(strRec[i] + " ");
		}
		System.out.println("--------------------");
		for (int i = 0; i < striter.length; i++) {
			System.out.print(striter[i] + " ");
		}
	}

	private static String[] generaepermutationIterative(String str, int i, int len) {
		String str1;
		String strite[] = null;
		int r = 0;
		System.out.println("using iterarive");
		for (int k = 0; k < str.length(); k++) {
			for (int l = 0; l < str.length(); l++) {
				str1 = str;
				strite[r] = swapString(str1, k, l);
				r++;

			}
		}
		return strite;

	}

	public static String[] generatePermutationRecursive(String str, int start, int end) {
		String array[] = new String[6];
		int k = 0;
		if (start == end - 1) {
			System.out.println(str);
			array[k] = str;
			k++;
		} else {
			for (int i = start; i < end; i++) {
				str = swapString(str, start, i);
				generatePermutationRecursive(str, start + 1, end);
				str = swapString(str, start, i);
			}
		}
		return array;
	}

}