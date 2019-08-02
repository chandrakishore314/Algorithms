package com.bridgelabz.algorithms;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.Bridgelbz.programms.Utility.algorithms.UtilityAlgorithms;

public class BinarySearchOfFile {
	
static boolean flag;
static String str2="Vennapusa222";
	public static void main(String[] args) throws IOException {
	
		File file = new File("H:\\test.txt"); 
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		
	
		  
		  String st; 
		  StringBuffer str=new StringBuffer();
		  while ((st = br.readLine()) != null) {
			  str.append(st);
		  }
		  String str1=str.toString();
		  String[] arrSplit = str1.split(" ");
		  UtilityAlgorithms ob = new UtilityAlgorithms(); 
	       ob.sort(arrSplit);
	   	System.out.println("test data as folows");
	       int length=arrSplit.length;
	       System.out.println(length);
			for( int i=0;i<length;i++) {
				
			if(str2.equals(arrSplit[i])) {
				flag=true;
				break;
			}
			}
			System.out.println(flag);
	       
	}

}
