package demo11;

import java.util.LinkedList;
import java.util.Random;

public class Processor {
	
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int limit = 10;
	private Object lock = new Object();
	
	public void produce() throws InterruptedException{
		Random random = new Random();
		while(true){
			synchronized(lock){
				while(list.size()==limit){
					lock.wait();
				}
				list.add(random.nextInt(500));
				lock.notify();
			}
		}
		
	}
	
	public void consume() throws InterruptedException{
		
		while(true){
			synchronized(lock){
				while(list.size()==0){
					lock.wait();
				}
				System.out.print("List size is: "+list.size());
				int value = list.removeFirst();
				System.out.println("; value is: "+value);
				lock.notify();
			}
			Thread.sleep(500);
		}
	}

}
