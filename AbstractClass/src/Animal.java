
public abstract class  Animal {
	
	public static int sta = 10;
	protected static int proSta = 40;
	private static int privSta = 50;
	static int def = 90;
	
	private static final int staFinaa = 20;
	
	public int pub = 30;
	protected int prot = 40;
	private int priv = 50;
	
	final int fin = 50;
	public final int pubFin = 70;
	protected final int proFin = 80;
	private final int privFin = 90;
	
	public void pubMethod()
	{
		System.out.println(" I am a public method");
	}
	
	private void priMethod()
	{
		System.out.println("I am a private method");	
	}
	
	protected void protMethod(){
		System.out.println("I am a protected method");
	}
	
	public static void pubStaMethod(){
		System.out.println(" I am a public static method");
	}
	
	private static void priStaticMethod(){
		System.out.println(" I am a private static method");
	}
	
	protected static void protStaticMethod(){
		System.out.println("I am a protected static method");
	}
	
	public final void pubFinalMethod(){
		System.out.println(" I am a public final method");
	}
	
	private final void privFinalMethod(){
		System.out.println("I am a private final method");
	}
	
	protected final void protFinalMethod(){
		System.out.println(" I am a protected final method");
	}

	public static final void PublicStaticFinalMethod(){
		System.out.println(" I am public a static final method");
	}
	
	private static final void PrivateStaticFinalMethod(){
		System.out.println("I am a private static fianl method");
	}
	
	protected static final void ProtectedStaticFinalMethod(){
		System.out.println(" I am a protected static final method");
	}
	
	public abstract void abstractMethod();
	
	//private abstract void abstractPrivateMethod();
		
	
	protected abstract void abstractProtectedMethod();
	
	//public abstract static void abd();
	
	
	
}
