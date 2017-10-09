package demo10;

import java.util.Scanner;

public class Processor {
	public void produce() throws InterruptedException{
		synchronized(this){
			System.out.println("Producer thread running....");
			wait(); // puts the thread to wait giving up the lock. this makes the consumer to acquire the lock.
			System.out.println("Producer resumed.");
		}
	}
	public void consume() throws InterruptedException{
		Scanner scanner = new Scanner(System.in);
		Thread.sleep(2000);
		synchronized(this){
			System.out.println("Hit the Return key...");
			scanner.nextLine();
			System.out.println("Input received.");
			notify(); // this make the consumer to give up the lock. This will make the producer to resume its operation.
			// The producer can resume its operation only after 5 Seconds.
			// This is to show that the notify does not hand-over the lock to the other thread unlike the wait() function.
			Thread.sleep(5000); 
		}
	}
}
