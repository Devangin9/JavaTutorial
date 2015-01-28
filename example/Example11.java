package example;

//recursion
//factorial example

public class Example11 {
	
	static int factorial(int i)
	{
		//base case
		if (i == 1){
			System.out.println("1! = 1");
			return 1;
		}
		//recursive definition 
		else{
			System.out.println("calling " + i + " * fact ( " + (i - 1) + " ) ");
			int answer =  i * factorial(i-1);
			System.out.println(i + "! =  " + answer);
			return answer;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(3));
	}
}
