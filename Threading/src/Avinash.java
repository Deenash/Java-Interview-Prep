
public class Avinash {
	
	
	public void testSynchronisedMethod(){
		System.out.println("Inside testSynchronisedMethod");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void testSynchronisedBlockWithThis(){
		System.out.println("Inside testSynchronisedBlockWithThis");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
     public void testSynchronisedBlockWithLockObject(){
    	 System.out.println("Inside testSynchronisedBlockWithLockObject");
 		try {
 			Thread.sleep(2000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
		
	}
	
	
}
