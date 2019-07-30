package org.bridgelabz.datastructures.primenumbers;
import java.util.ArrayList;

import org.Bridgelbz.programms.Utility.algorithms.UtilityAlgorithms;

public class PrimeNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> primes=new ArrayList<Integer>();
		int array[][]=new int[10][100];
		int prev=0,curret=100,j=0,k=0;
	primes=UtilityAlgorithms.PrimeNumbers(1000);
for(int i=0;i<primes.size();i++) {	
	if(primes.get(i)>=prev&&primes.get(i)<=curret) {
		k++;
	array[j][k]=primes.get(i);
	
		
	}else {
		
		
		prev+=100;
		curret+=100;
		j+=1;
		k=0;
		array[j][k]=primes.get(i);
	}
	}
for (int k1 = 0; k1 < 10; k1++) {
	for (int j1 = 0; j1 < 100; j1++) {
		if (array[k1][j1] != 0) {
		System.out.print(array[k1][j1] + " ");
		}
	}
	System.out.println();

}
}}