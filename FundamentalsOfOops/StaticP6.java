class StaticP6{
	static{
	System.out.println("From SIB");
	int j=50;
	StaticP6.j=j;
	}
	public static double run(int i){
	System.out.println("From run()...!");
	return StaticP6.j;
	}
	public static void main(String[] args){
	double d=StaticP6.run(10);
	System.out.println(d);
	}
	static int j=20;
}
/*o/p:-
From SIB
From run()...!
20.0
*/