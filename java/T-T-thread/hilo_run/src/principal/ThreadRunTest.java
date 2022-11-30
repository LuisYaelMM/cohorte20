package principal;

import threads.MiEjecutable;

public class ThreadRunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] t = new Thread[4];
		MiEjecutable[] o = new MiEjecutable[4];
		for (int i = 0; i < 4; i++) {
			o[i] = new MiEjecutable(i);
			t[i] = new Thread(o[i]);

			System.out.println("nuevo hilo " + t[i]);
		}

		for (int i = 0; i < 4; i++) {
			t[i].start();
		}
		for (int i = 0; i < 4; i++) {
			try {
				t[i].join();

			} catch (InterruptedException e) {
				// TODO: handle exception
			}

			for (int j = 0; j < 4; j++) {
				o[i].visualizar();
			}

		}

	}

}
