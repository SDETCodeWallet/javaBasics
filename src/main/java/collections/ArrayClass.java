package collections;

public class ArrayClass {

	/*
	 * java Array is an object in java that contains of similar type of data. We
	 * can only store fixed type of elements Array is index based Array start
	 * from Zero index Advantage: Code optimized , Retrieve the data fast.
	 * Random access : Get the data located at any index pos. Disadvantage:
	 * Fixed Size in nature. (To solve the issue collections framework is used
	 * in java) Types of array: 1) Single D array 2) Multi D array
	 * 
	 */

	/*
	 * Declare array
	 * 
	 * dataType[] array;
	 */
	protected void declareArray() {
		int[] array; // or
		int[] array1; // or
		int array3[];

	}

	protected void intiliazeArray() {
		int array[];
		array = new int[5];

	}

	public static void main(String[] args) {
		singleDProgram();
		program2();
		int a[]={45,45,78,78}; 
		arrayPassing(a);

	}

	// Example of single dimensional java array
	public static void singleDProgram() {
		int a[] = new int[5];// declaration and instantiation
		a[0] = 10;// initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
		System.out.println("singleDProgram execution result");
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}

	// Declaration, Instantiation and Initialization of Java Array
	//
	// We can declare, instantiate and initialize the java array together by:
	//
	// int a[]={33,3,4,5};//declaration, instantiation and initialization

	public static void program2() {
		int test[] = { 45, 45, 787, 5454 };
		System.out.println("program2 execution result");
		for (int i = 0; i <= test.length - 1; i++) {
			System.out.println(test[i]);
		}
	}

	public static void arrayPassing(int[] a) {
		System.out.println("arrayPassing execution result");
      for(int j=0 ; j<=a.length-1; j++){
    	  System.out.println(a[j]);
      }
      
	}

}
