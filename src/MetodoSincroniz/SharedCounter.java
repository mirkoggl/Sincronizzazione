package MetodoSincroniz;

public class SharedCounter {
	private int x;
	
	public SharedCounter() {
		x=0;
	}
	public int leggi(){
		return x;
	}
	public synchronized void incrementa(){
		System.out.println("Valore letto prima: "+this.leggi());
		x++;
		System.out.println("Incremento..");
		System.out.println("Valore letto dopo: "+this.leggi());
	}

}
