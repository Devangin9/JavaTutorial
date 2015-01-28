package example;

import java.util.Vector;

//vectors
// http://docs.oracle.com/javase/7/docs/api/java/util/Vector.html
public class Example10 {
	public static void main(String[] args) {
		//adding elements
		Vector<Integer> queue = new Vector<Integer>();
		queue.add(1);
		queue.add(new Integer(1));
		
		
		Vector<Point> pointQueue = new Vector<Point>();
		pointQueue.add(new Point());
		pointQueue.add(new Point(1,2));
		pointQueue.add(new Point(3,4));
		
		//acccessing
//		for(int i = 0 ; i < pointQueue.size(); i++){
//			System.out.println( pointQueue.get(i));
//		}
		
		//settting
//		pointQueue.get(2).x = 10;
//		for(int i = 0 ; i < pointQueue.size(); i++){
//			System.out.println( pointQueue.get(i));
//		}
		
	}
}
