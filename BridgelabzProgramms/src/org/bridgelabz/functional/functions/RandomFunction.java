package org.bridgelabz.functional.functions;

import org.bridgelabz.functional.utility.Utility;

public class RandomFunction {

	public static void main(String[] args) {
		int head=0,tail=0,trials,win=0,loss=0;
		System.out.println("enter number of trials u want");
trials=Utility.getScanner().nextInt();
for(int i=0;i<trials;i++) {
	if(Math.random()>0.5) win++;
	else loss++;
}
double winp=win*100/trials;
double lossp=loss*100/trials;
System.out.println("wins % as"+winp+"  wins are"+win);
System.out.println("loss % as"+lossp+" losses are"+loss);
	}

}
