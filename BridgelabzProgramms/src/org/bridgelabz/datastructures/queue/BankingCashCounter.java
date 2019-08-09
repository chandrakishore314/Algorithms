package org.bridgelabz.datastructures.queue;

import java.util.Scanner;

import org.bridgelabz.programms.utility.datastructures.Queue;

public class BankingCashCounter {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter cashcounter money");
int money=scanner.nextInt();
System.out.println("enter number of persons in queue");
int persons=scanner.nextInt();
Queue<Integer> queue=new Queue<Integer>(persons);
for(int i=0;i<persons;i++) {
	queue.push(i);
}
System.out.println("enter your choice:(1)Deposit Cash \n"
		+ "(2)withdraw cash\n"+
		"(3)Balance check\n"
		+"(4)exit from queue\n");
int deposit=scanner.nextInt();
int withdraw=scanner.nextInt();
for(int i=0;i<persons;i++) {

int num=scanner.nextInt();
switch(num) {
case 1: 
	money=money+deposit;
case 2:money=money-withdraw;
case 3:System.out.println(money);
         
case 4:queue.pop();
}}






	}

}
