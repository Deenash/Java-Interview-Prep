package demo7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/*
 * In this program ExecutorService is used to create a Threadpool with specifying the number of threads 
 * needs to be there in the threadpool.
 * 
 * The tasks are generally created and the executor takes care of creating the threads and assigning the 
 * tasks to them. Once a thread completes executing its task, it goes back to the threadpool.
 * Again executor has to recycle the available threads from the threadpool with the new tasks.
 * 
 * */
class Processor implements Runnable{
	
	private int id;
	
	public Processor(int id){
		this.id = id;
	}
	
	public void run(){
		System.out.println("Starting: "+id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed: "+id);
	}
}

public class App {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(2); // Here 2 denotes the number of threads/workers to be created	
		
		/*Creating the task: */
		for(int i =1; i <= 5; i++){
			executor.submit(new Processor(i));
		}
		
		executor.shutdown();
		
		/*Completing the tasks and shutting down the executor service*/
		
		System.out.println("All tasks completed");
		
		try {
			executor.awaitTermination(2, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All Tasks Completed");
		
	}

}
