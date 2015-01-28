package example;

class Point {
    int x;
    int y;
    private boolean isZero;

    //default constructor
    Point() {
        this(0, 0);
    }

    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    private boolean checkZero()
    {
    	if(x == 0 && y == 0){
//    		isZero = true;
    		return true;
    	}
    	return false;
    }
    
    public Point addPoints(Point anotherPoint)
    {
    	Point point = new Point(this.x + anotherPoint.x, this.y + anotherPoint.y);
    	return point;
    }


	@Override
	//remember what happened when you try to print array!
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
    
}
