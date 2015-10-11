package MetodoSincroniz;

public class Thread1 extends Thread {
	private SharedCounter c;
	
	public Thread1(SharedCounter x) {
		c=x;
	}
	
	public void run(){
		for (int i=0;i<10;i++){ 
			c.incrementa();
		}
	}

}
