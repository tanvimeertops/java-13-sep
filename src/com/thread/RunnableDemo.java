package com.thread;
class RDemo implements Runnable{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("this is Second thread!!!");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class RunnableDemo {
public static void main(String[] args) throws InterruptedException {
	RDemo rd=new RDemo();
	Thread t1=new Thread(rd);
	t1.start();
	
	
	
	for (int i = 0; i < 5; i++) {
		System.out.println("this is main thread!!!");
		Thread.sleep(2000);
	}
}
}
