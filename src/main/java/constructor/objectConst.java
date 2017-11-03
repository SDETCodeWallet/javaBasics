package constructor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectConst {
	
	public static void main(String []args) {
		ConstructorClassA test=new ConstructorClassB(); 
		
		ConstructorClassA parentclass=(ConstructorClassA)test; 
		parentclass.test();
	}
	
	public void test() {
		System.out.println("Object Class");
	}
	
	public void childMethod() {
		System.out.println("child method");
	}
	

}
