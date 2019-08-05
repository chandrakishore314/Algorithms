package org.bridgelabz.algorithms;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("enter the elements");
		Scanner sc =new Scanner(System.in);
		int length=sc.nextInt();
		int array[]=new int[length];
		for(int i=0;i<length;i++) {
			array[i]=sc.nextInt();
		}
		MergeSort mergeSort=new MergeSort();
		mergeSort.mergeSort(array,0,length-1);
		System.out.println("after merge sorting");
		for(int i=0;i<length;i++) {
			System.out.println(array[i]);
		}
		

	}

	private  void mergeSort(int[] array, int beg, int end) {
		if(beg<end) {
			int mid =(beg+end)/2;
			mergeSort(array,beg,mid);
			mergeSort(array,mid+1,end);	
			merge(array,beg,mid,end);
		}
		
	}

	private  void merge(int[] array, int beg, int mid, int end) {
		int l,r;
		l=mid-beg+1;
        r=end-mid;
        int leftArr[]=new int[l];
        int rightArr[]=new int[r];
        for(int i=0;i<l;i++) {
        	leftArr[i]=array[beg+i];
        }
        for(int j=0;j<r;j++) {
        	rightArr[j]=array[mid+1+j];
        }
        
        int i=0,j=0;
       int  k=beg;
       while(i<l&&j<r) {
    	   if(leftArr[i]< rightArr[j]) {
    		   
    		   array[k]=leftArr[i];
    		   i++;
    	   }
    	   else {
    		   array[k]=rightArr[j];
    		   j++;
    	   }
    	   k++;
       }
        
       while(i<l) {
    	   array[k]=leftArr[i];
    	   k++;
    	   i++;
       }
       while(j<r) {
    	   array[k]=rightArr[j];
    	   k++;
    	   j++;
       }
}
}