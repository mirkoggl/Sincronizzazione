package Barriera;
import java.util.concurrent.*;
	
public class Threaddino extends Thread{
	private CyclicBarrier barrier;
	
	public Threaddino(CyclicBarrier c){
		barrier=c;
	}
	
	public void run(){
		while(true){
			System.out.println("Ciao sono il Threaddino "+this.getName());
			try {
				barrier.await();
				//System.out.println(" ");
			} catch (InterruptedException e) {
				 //TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				 //TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
