package demo8;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable{
	
	private CountDownLatch latch;
	
	public Processor(CountDownLatch latch){
		this.latch=latch;
	}
	
	public void run(){
		System.out.println("Started.");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Once the thread finishes the above process, we can count-down the latch.
		// We can do this at any point according to our convenience
		
		latch.countDown();
	}
}

public class App {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);

		for(int i=0;i<3;i++){
			executor.submit(new Processor(latch));
		}
		
		try {
			// Here the await waits until the latches counted down to zero.
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed.");
	}

}
