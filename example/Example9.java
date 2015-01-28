package example;

import java.lang.ArrayIndexOutOfBoundsException;

//exceptions
public class Example9 {
	public static void main(String[] args) {

//		try{

			int array[] = {1, 2, 3, 4, 5, 0};
			for(int i = 0 ; i < 10 ; i ++)
			{
				System.out.println(array[i]);
//				System.out.println(10 / array[i]);
			}
//		}catch(ArrayIndexOutOfBoundsException e ){
//			System.out.println("caught java.lang.ArrayIndexOutOfBoundsException");
//		}
//		catch(Exception e){
//			System.out.println("caught Exception");
//		}
	}
}
