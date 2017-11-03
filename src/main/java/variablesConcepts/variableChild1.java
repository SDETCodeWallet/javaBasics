package variablesConcepts;

public class variableChild1 extends variableChild2 {

	variableChild1(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	private String privateInstanceVar = "privateInstanceVar";
	public static String publicStaticVar = "publicStringVar";
	String defaultInstanceVar = "defaultInstanceVar";
	static String staticVar = "staticvar";

	public static void main(String[] args) {
		String publicStaticVar="method var";

		
		System.out.println(publicStaticVar);
		
		 variableChild1 test = new variableChild1(publicStaticVar);
		 test.returnNonStaticValue();

	}

	public void returnNonStaticValue() {
		String privateInstanceVar = "method variable";
		System.out.println(privateInstanceVar);
		System.out.println("object variable " + super.defaultInstanceVar);

	}

}
