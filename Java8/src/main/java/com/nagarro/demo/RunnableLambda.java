package com.nagarro.demo;

public class RunnableLambda {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello");
		/*Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Hello Lambda... from thread [ " + Thread.currentThread().getName() + " ]");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());

					}
				}

			}
		};*/

		Runnable runnableLambda = () -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("Hello Lambda... from thread [ " + Thread.currentThread().getName() + " ]");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());

				}
			}

		};

		Thread thread = new Thread(runnableLambda);

		thread.start();
		thread.join();

	}

}
