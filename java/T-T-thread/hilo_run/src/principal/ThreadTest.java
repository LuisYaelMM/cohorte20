package principal;

import threads.Thread1;
import threads.Thread2;

public class ThreadTest {
	public static void main(String[] args) {
		Thread1 hilo=new Thread1();
		Thread2 hilo2=new Thread2();
		
		hilo.start();
		hilo2.start();
		
		try {
			hilo.join();
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println("Se ejecutan los dos threads");
		
	
	}
}
