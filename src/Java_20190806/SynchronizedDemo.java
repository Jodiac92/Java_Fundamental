package Java_20190806;

import Java_20190806.SynchronizedDemo;

public class SynchronizedDemo implements Runnable{
	int x;
	int y;
	
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		//synchronized (this) {
		synchronized (SynchronizedDemo.class) {
			for(int i=0;i<1000;i++) {
				x++;
				y++;
				String threadName = Thread.currentThread().getName();
				System.out.printf("x : %d, y : %d - %s%n", 
					x,y,threadName);
			}
		}
		
	}
	
	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		t1.start();
		t2.start();
	}
	
	
}
