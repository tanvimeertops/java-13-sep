package com.thread;
/*
 * THread :any process
 * single processor
 * multi process
 * 
 * thread life cycle
 * newborn 
 * running
 * runnable
 * blocked
 * dead
 */
class TDemo extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("this is First thread!!!");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class ThreadDemo {
public static void main(String[] args) throws InterruptedException {
	TDemo tDemo=new TDemo();
	tDemo.start();
	
	for (int i = 0; i < 5; i++) {
		System.out.println("this is main thread!!!");
		Thread.sleep(2000);
	}
}
}
