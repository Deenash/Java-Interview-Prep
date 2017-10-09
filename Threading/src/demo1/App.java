package demo1;

class Runner extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Hello: "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class App {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner1 = new Runner();
		Runner runner2 = new Runner();
		
		runner1.start(); // Here calling the run method will run the method in the main thread.
		runner2.start();
	}
}
