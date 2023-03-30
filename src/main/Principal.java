package main;

public class Principal extends Thread {
	private int id;
	
	
	public Principal(int id) {
		this.id=id;
	}
	
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Soy el hilo: "+ id);
	}	
	
}
