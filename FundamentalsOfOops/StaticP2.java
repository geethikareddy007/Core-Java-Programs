class StaticP2{
	static int i=10;
	public static void main(String[]args){
		System.out.println("FM");
		System.out.println(i);
		run();
		System.out.println(i);
		System.out.println("ME");
	}
	public static void run(){
	int j=20;
	StaticP2.i=j;
	System.out.println(i);
	}
	
}
/* o/p:-
FM
10
20
20
ME
*/