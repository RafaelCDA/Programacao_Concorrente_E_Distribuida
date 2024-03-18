package aula1;


public class main {
	public static void main(String[ ]args) throws InterruptedException {
		System.out.println("Hello World!");
		ola ola = new ola();
		ola ola2 = new ola();
		ola ola3 = new ola();
		
		tchau tchau = new tchau();
		tchau tchau2 = new tchau();
		tchau tchau3 = new tchau();
		
		ola.start();
		ola2.start();
		ola3.start();
		
		
		ola.join();
		ola2.join();
		ola3.join();
		
		tchau.start();
		tchau2.start();
		tchau3.start();
		
		tchau.join();
		tchau2.join();
		tchau3.join();
		
		System.out.println("Acabou a main!!!");
	}
}