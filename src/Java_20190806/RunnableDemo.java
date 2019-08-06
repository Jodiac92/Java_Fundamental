package Java_20190806;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("%s : %d%n",threadName,i);
	}
}
	public static void main(String[] args) {
		System.out.println("*****************start****************");
		//1. Thread 클래스를 상속 받는다.
		//2. run() 메서드를 overriding한다.
		//3. 해당 객체를 생성한다.
		//4. 해당 객체로 start() 메서드를 호출 한다.
		RunnableDemo r1 = new RunnableDemo();
		Thread t1 = new Thread(r1);
		t1.start();
		
		RunnableDemo r2 = new RunnableDemo();
		Thread t2 = new Thread(r2);
		t2.start();
		
		
		System.out.println("******************end*****************");
	}

}
