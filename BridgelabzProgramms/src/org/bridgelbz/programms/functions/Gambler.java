package org.bridgelbz.programms.functions;

import java.util.Scanner;

public class Gambler { 

    public static void main(String[] args) {
    	 int stake,goal,trials;  
         Scanner sc =new Scanner(System.in);
        System.out.println("enter stake Amount");
        stake=sc.nextInt();
        System.out.println("enter goal");
        goal=sc.nextInt();
        System.out.println("enter trails");
        trials=sc.nextInt();  
        if(stake<0 ||goal<0||trials<0||stake>goal) {
        	System.out.println("it is imposible to run the trails");
        }else {
        
        int win = 0,loss=0,noOfTimesPlayed=0,cash = stake;        

        sc.close();
        for (int t = 0; t <=trials; t++) {

        	noOfTimesPlayed++;
              if(Math.random()>0.5) {win++;cash++;}
              else {cash--;loss++;}
            if (cash == goal||cash<0) {
            	break;
            }                
        }
float winp,lossp;
winp=win*100/noOfTimesPlayed;
lossp=loss*100/noOfTimesPlayed;
    
        System.out.println(win + " wins && " + loss+" losses "+" noOfTimesPlayed "+noOfTimesPlayed);
        System.out.println("Percent of games won = " +winp);
        System.out.println("Percent of games won ="+lossp);
        }
    }

}