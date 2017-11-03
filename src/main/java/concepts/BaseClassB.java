package concepts;

class BaseClassB extends BaseClassA {

	public BaseClassB(browserType type) {
		super(type);

	}

	String st1 = "Base Class b string 1";
	String st2 = "Base Class b string 2";

	protected void method1() {
		System.out.println("Base Claas b method 1");
	}

	public void method2() {
		System.out.println("Base Claas b method 2");
	}

}
