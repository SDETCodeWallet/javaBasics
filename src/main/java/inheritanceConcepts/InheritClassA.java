package inheritanceConcepts;

class InheritClassA {

	static int a = 45;
	public String publicNonStaticVar = "public non static var";
	private String privateNonStaticVar = "private non static variable";
	public final static String finalPublicStaticVar = "Final Static var";
	private final String finalPrivateNonStaticVar = "Non static Final Var";

	static {
		System.out.println("Inside Static block");
	}

	{
		System.out.println("Inside non static block");
	}

	InheritClassA() {
		System.out.println("Inside COnstructor");
	}

	InheritClassA(String test) {
		System.out.println(test);
	}

	public void nonStatic() {
		System.out.println("non static method");
	}

	public static void Static() {
		System.out.println("Static method");
	}

}
