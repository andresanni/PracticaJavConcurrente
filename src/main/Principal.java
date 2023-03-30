package main;

public class Principal extends Thread {
	private int id;
	public static int cont = 0;
	
	
	public Principal(int id) {
		this.id=id;
	}
	
	public void run() {
				
		for (int i = 0; i < 1000; i++) {
			cont ++;			
		}
	}	
	
}
