package demo9;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*
 * Example showing Producer-Consumer Problem.
 * One Thread acts as the producer. Another thread acts as the Consumer.
 * The producer will keep adding the integer elements into the queue as far as it is not full
 * The consumer will keep removing the elements from the queue as far as the queue is not empty.
 * */

/*
	Example describing the wait(), notify() and notifyAll():
	http://www.journaldev.com/1037/java-thread-wait-notify-and-notifyall-example
*/

public class App {
	
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
	
	private static void producer() throws InterruptedException{
		Random random = new Random();
		
		while(true){
			int temp = random.nextInt(100);
			queue.put(temp);
			System.out.println("Element Added: "+temp);
		}
	}
	
	private static void consumer() throws InterruptedException{
		Random random = new Random();
		
		while(true){
			Thread.sleep(100);
			
			if(random.nextInt(10)==0){
				Integer value = queue.take();
				System.out.println("Element Removed: "+value);
			}
		}
	} 

}
