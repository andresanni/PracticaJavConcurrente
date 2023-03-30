package main;

public class Main {

	public static void main(String[] args) {
		
		Principal[] vec = new Principal[5];
		
		for (int i= 0; i<vec.length; i++) {
			vec[i] = new Principal(i+1);
		}
		
		
		for(int i=0; i<vec.length;i++) {
			vec[i].start();
		}
		
		System.out.println("Soy el hilo principal");

	}

}
