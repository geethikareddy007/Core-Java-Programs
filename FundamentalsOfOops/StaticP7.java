class StaticP7{
	static int a=run();
	static{
		System.out.println("From SIB-1");
	}
	public static int run(){
		System.out.println("rb");
		int a=10;
		System.out.println("re");
		return 'A';
	}
	public static void main(String[] args){		//o/p came
		System.out.println("mb");
		System.out.println(a);
		String a="java";
		System.out.println(a);
		System.out.println("ME");
	}
}
/*o/p:-
rb
re
From SIB-1
mb
65
java
ME
*/