package main;

public class Principal extends Thread {
	
	public static int tam = 8;
	public static int numeros[] = new int[tam];
	private int ini;
	private int fin;
	
	public Principal(int ini, int fin) {
		this.ini = ini;
		this.fin = fin;
	}
	
	public void run() {
		
		for (int i = ini; i<fin;i++) {
			numeros[i]*=10;
		}
		
	}	
	
}
