package main;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Principal h1 = new Principal(0,4);
		Principal h2 = new Principal(4,8);
		Random random = new Random(System.nanoTime());
		
		for (int i = 0; i < Principal.numeros.length; i++) {
			Principal.numeros[i] = random.nextInt(10);
		}
		
		System.out.println("----Vector inicial---- ");
		for (int i = 0; i < Principal.numeros.length; i++) {
			System.out.println(Principal.numeros[i]);
		}
		
		
		h1.run();
		h2.run();
		
		try {
			h1.join();
			h2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("----Vector final---- ");
		for (int i = 0; i < Principal.numeros.length; i++) {
			System.out.println(Principal.numeros[i]);
		}
		
		
	}

}
