package example;

import java.util.Arrays;

//Arrays
public class Example4 {

	
	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4, 5};
		
		System.out.println(array.length);
		
		//guess the number
		System.out.println(array[1]);
		
		array[1] = 10;
		System.out.println(array);
		//System.out.println(Arrays.toString(array));
		
		int zeros[];
		//System.out.println(Arrays.toString(zeros));
		zeros = new int[10];
		//System.out.println(Arrays.toString(zeros));
	}
}
