class Rectangle1User{
	public static void main(String[] args){
		System.out.println("-----first reactangle----");
		Rectangle1 r1 = new Rectangle1();
		r1.length = 10.0;
		r1.height = 11.3;
		r1.width = 5.8;
		r1.area();
		r1.dis();
		System.out.println("-----second reactangle----");
		Rectangle1 r2 = new Rectangle1();
		r2.length = 5.0;
		r2.height = 7.2;
		r2.width = 3.5;
		r2.area();
		r2.dis();
	}
}
/*O/p:-
-----first reactangle----
Area of rectangle1 is : 655.4
length is:10.0
height is:11.3
width is:5.8
-----second reactangle----
Area of rectangle1 is : 126.0
length is:5.0
height is:7.2
width is:3.5
*/

