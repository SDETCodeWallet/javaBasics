package variablesConcepts;

public class variableChild2 extends variableTest3{
	

	variableChild2(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	int te = 45454;
	static int tedsadast = 45;
	String privateInstanceVar="dsfsd";
	public String defaultInstanceVar;
	 
	public static void main(String args[]) {
		variableTest3 testsadas=new variableChild2(""); 
		System.out.println(testsadas.test); 
	}

	public void testValue() {
		int te = 878;

		System.out.println(te);
		System.out.println(this.te);

	}

}
