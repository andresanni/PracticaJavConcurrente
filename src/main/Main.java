package main;

public class Main {

	public static void main(String[] args) {

		Principal[] vec = new Principal[1000];

		for (int i = 0; i < vec.length; i++) {
			vec[i] = new Principal(i + 1);
			vec[i].start();
		}

		try {
			for (int i = 0; i < vec.length; i++) {
				vec[i].join();
			}
		} catch (Exception ex) {

		}

		System.out.println(Principal.cont);

	}

}
