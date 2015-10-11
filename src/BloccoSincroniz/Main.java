package BloccoSincroniz;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedInt x=new SharedInt();
		
		Threaddino t1= new Threaddino(x);
		Threaddino t2= new Threaddino(x);
		Threaddino t3= new Threaddino(x);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
