package example;

//functions continued
public class Example7 {
	
	//parameter - pass by value
	int add(int a, int b){
		int c = a + b;
		System.out.println("c = " + c);
		return c;
	}
	
	//static functions
	static boolean checkOdd(int i){
		return i % 2 == 1;
	}
	
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		
		Example7 eg = new Example7();
		//arguments
		int d = eg.add(i1, i2);
		System.out.println("d = + d");
	
//		System.out.println(checkOdd(i1));
		
	}
}
