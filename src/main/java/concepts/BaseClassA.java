package concepts;

public class BaseClassA extends ParentClass {

	public BaseClassA(browserType type) {
		super(type);

	}

	public static String st1 = "Base Claas A string1";
	public static String st2 = "Base Claas A string2";

	@Override
	protected void method1() {

		System.out.println("Base Claas A method 1");
	}

	@Override
	public void method2() {
		System.out.println("Base Claas A method 2");
	}

}
