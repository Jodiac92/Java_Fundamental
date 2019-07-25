package Java_20190725.step2;

import Java_20190725.step1.FootNanoStopWatch;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch s1 = new StopWatch();
		s1.startNano();

		for(long i=0; i<30_000_000_000l;i++) {
			
		}
		s1.stopNano();
		
		double elapsedTime = s1.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
}
