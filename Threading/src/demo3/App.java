package demo3;

public class App {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				System.out.println("Inside Run");
			}
		});
		
		t1.start();
	}

}
