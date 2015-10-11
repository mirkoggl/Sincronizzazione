package MetodoSincroniz;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedCounter c=new SharedCounter();
		Thread1 t1=new Thread1(c);
		Thread1 t2=new Thread1(c);
		Thread1 t3=new Thread1(c);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
