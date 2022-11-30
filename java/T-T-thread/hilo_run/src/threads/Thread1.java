package threads;

import java.util.Iterator;

public class Thread1 extends Thread{
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print(" 1 ");
		}
	}
}
