package Barriera;

import java.util.concurrent.*;


public class Main {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CyclicBarrier b=new CyclicBarrier(3);
		Threaddino t1=new Threaddino(b);
		Threaddino t2=new Threaddino(b);
		Threaddino t3=new Threaddino(b);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
