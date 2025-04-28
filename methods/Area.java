class Area{
	public static void square(int s){
		System.out.println("Area of square is:"+(s*s));
	}
	public static void circle(int r){
		System.out.println("Area of circle is:"+(3.14*r*r));
	}
	public static void rectangle(int l, int b){
		System.out.println("Area of rectangle is:"+(l*b));
	}
	public static void triangle(int b, int h){
		System.out.println("Area of triangle is:"+(0.5*b*h));
	}
	public static void main(String[] args){
		rectangle(5,6);	//30
		square(3);	//9
		circle(5);	//78.5
		triangle(5,3);	//7.5
	
	}

}

	