package demo5;

public class App {
	
	private int count = 0;

	public static void main(String[] args) {
		App app = new App();
		app.doWork();
	}
	
	public synchronized void increment(){
		count++;
	}
	
	public void doWork(){
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<10000;i++){
					increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<10000;i++){
					increment();
				}
			}
		});
		
		System.out.println("Before Thread Execution: "+count);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			System.out.println("In between Thread execution:"+ count);
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Here 'join' used to make sure that the Thread completes their operation.
		// W/o 'join', the next statement will print the 'count' value as 0.
		
		// After join the count value will be set to 20000 / some other value less than 20000.
		// This is because, there are times when both the thread read the same count value and increments to 1 
		// and then saves the assigns the same value to the 'count'.
		// Eg.: Both t1 and t2 read 'count' as 100. And t1 makes count as 101 and again t2 also makes count as 101,
		// which is supposed to be 102
		System.out.println("After Thread Execution Completion: "+count);
		
	}

}
