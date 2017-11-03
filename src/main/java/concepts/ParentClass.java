package concepts;

import org.openqa.selenium.WebDriver;

enum browserType {

	chrome, internet, firefox;

}

public class ParentClass {

	protected String st1 = "parent class string1";
	protected String st2 = "parent class string2";
	
	static browserType type; 
	
	public ParentClass(browserType type) {
		this.type=type; 
	}

	public void testbrowserType(){
		switch(type){
		case internet: System.out.println("internet");
		break; 
		case chrome: System.out.println("chromeBrowser");
		break; 
		case firefox: System.out.println("Firefox");
		break; 
		}
	}
	public static void main(String[] args) {
		String str="internet"; 
		ParentClass classa=new ParentClass(browserType.valueOf(str));
		classa.testbrowserType();
		
		

	}

	protected void method1() {
		System.out.println("parent method 1");

	}

	protected void method2() {
		System.out.println("parent method 2");
	}
}
