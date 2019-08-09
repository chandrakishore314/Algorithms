package org.bridgelabz.programms.functions;

public class Stopwatch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		long now = System.currentTimeMillis();
		for(int i=0;i<2;i++)
		{
			
			Thread.sleep(1000);
		}
		
		long stopTime= System.currentTimeMillis();
		double elapsedtime;
		elapsedtime=(stopTime - now) / 1000.0;
		System.out.println("elapsed time is"+elapsedtime);
		
		
	}

}
