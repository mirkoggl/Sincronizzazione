package BloccoSincroniz;

public class SharedInt {
	private int x;
	
	public SharedInt(){
		x=0;
	}
	
	public void scrivi(int y){
		x=y;		
	}
	
	public int leggi(){
		return x;
	}
	
}
