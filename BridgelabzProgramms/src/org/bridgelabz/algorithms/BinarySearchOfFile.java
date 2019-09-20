package org.bridgelabz.algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.bridgelabz.programms.utility.Utility;

public class BinarySearchOfFile {

	static boolean flag;
	static String str2 = "Vennapus2";

	public static void main(String[] args) throws IOException {

		File file = new File("H:\\test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		StringBuffer str = new StringBuffer();
		while ((st = br.readLine()) != null) {
			str.append(st);
		}
		br.close();
		String str1 = str.toString();
		String[] arrSplit = str1.split(" ");
		Utility.sort(arrSplit);
		System.out.println("test data as folows");
		int length = arrSplit.length;
		System.out.println(length);
		for (int i = 0; i < length; i++) {
			if (str2.equals(arrSplit[i])) {
				flag = true;
				break;
			}
		}
		System.out.println(flag);

	}

}
