package main;

public class Principal extends Thread {
	private int id;
	
	
	public Principal(int id) {
		this.id=id;
	}
	
	public void run() {
		System.out.println("Soy el hilo: "+ id);
	}	
	
}
