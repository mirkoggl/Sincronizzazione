package BloccoSincroniz;

public class Threaddino extends Thread{
	private SharedInt x;
	private int d;
	
	public Threaddino(SharedInt y){
		x=y;
	}
	
	public void run() {
		for (int i=0;i<10;i++){
			d=(int)(Math.random()*100)%100;		//Argomento del Synchronized deve essere l'oggetto condiviso
			synchronized(x){					//Eliminando Synchronized si perde la mutua esclusione
				System.out.println("[Thread-"+this.getName()+"]: scrivo -> "+d);
				x.scrivi(d);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					System.err.println("Errore sleep..");
					e.printStackTrace();
				}
				System.out.println("[Thread-"+this.getName()+"]: leggo -> "+x.leggi());
			}
		}
	}

}
