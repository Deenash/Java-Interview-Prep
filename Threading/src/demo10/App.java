package demo10;

public class App {

	public static void main(String[] args) {
		final Processor processor = new Processor();
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				try {
					processor.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				try {
					processor.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		
		t1.run();
		t2.run();
	}

}