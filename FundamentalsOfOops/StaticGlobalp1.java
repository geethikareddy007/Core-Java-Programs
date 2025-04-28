class StaticGlobalp1{
	static int i=10;
	public static void main(String[] args){
	System.out.println("From Main");
	System.out.println(i);
		int i=50;
		System.out.println(i);
		System.out.println(StaticGlobalp1.i);
		System.out.println("ms");
	}
}

/*o/p:-
From Main
10
50
10
ms
*/