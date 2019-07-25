package Java_20190725.step5;

import Java_20190725.step2.StopWatch;

public class StopWatchDemo {
	public static void execute(StopMilliWatch sm) {
		
	}	

		s1.start();

		for(long i=0; i<30_000_000_000l;i++) {
			
		}
		s1.stop();
		
		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime); //System.out.printf("경과시간 : %.9f", elapsedNanoTime);
	}
	
	public static void execute(StopNanoWatch sn) {
		
	}
	
	public static void main(String[] args) {
		StopMilliWatch s1 = new StopMilliWatch();  //StopNanoWatch s1 = new StopNanoWatch();
		s1.start();

		for(long i=0; i<30_000_000_000l;i++) {
			
		}
		s1.stop();
		
		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime); //System.out.printf("경과시간 : %.9f", elapsedNanoTime);
	}
}


