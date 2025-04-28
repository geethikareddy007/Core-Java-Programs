class StaticP3{
	public static double run(int i){
		return i+2.0;
	}
	static double d=run(10);
	public static void main(String[] args){
		System.out.println("FM");
		System.out.println(StaticP3.d);
		System.out.println("ME");	//o/p came
	}
}
/*o/p:-
FM
12.0
ME
*/