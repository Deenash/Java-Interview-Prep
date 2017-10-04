package GoForAnonymousClass;

public class TestAnimal {

	public static void main(String[] args) {
		
		
		Animal anonymousChild = new Animal(){//Anonymous Class
			//This is basically a child class of Animal Class only but has got no name
			//This is basically used to override the parent class functionality easily without creating a child class
			int instanceAnonymousVariable = 60;
			static final int staFin = 80;//static final variables are allowed
			final int finalls = 10;
			//static int sta = 1;;//error static not allowed
			@Override
			public void eat(){
				System.out.println("Dog eats");
			}
			public void print(){
				int methodLocal = 20;//local variables can be used
				methodLocal = methodLocal + 20;
				System.out.println(finalls);//final variables can be used
				System.out.println(stat);//static variables can be used inside anonymous class i.e static variable of parent class
				System.out.println(instanceAnonymousVariable );//instance variable of anonymous class
				System.out.println(staFin);//static final variable of anonymous class
				//System.out.println(ins);//
				System.out.println(prott);
			}
		};
		
		Animal parent = new Animal();
		parent.eat();
		anonymousChild.eat();
		
		//Anonymous class has no name
		//It can be instantiated only once
		//It does not have a constructor because it has no name
		//It cannot be static
		
	}

}
