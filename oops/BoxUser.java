class  BoxUser{
	public static void main(String[] args){
		Box obj=new Box (4,5,6);
		obj.details();
		System.out.println("---------------");
		Box obj1=new Box(5,2);
		obj1.details();
		System.out.println("------------------");
		Box obj2=new Box(4,2);
		obj2.details();
	}
}
/*O/P:-
length is:4
width is:5
height is:6
---------------
length is:5
width is:2
------------------
length is:4
width is:2
*/