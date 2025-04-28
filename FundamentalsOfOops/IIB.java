class IIB{
	static int i=10;
		int j=20;
	static{
		System.out.println(i);
	}
	{
		System.out.println(j);
	}
	public static void main(String[] args){
		IIB obj = new IIB();	
	}
}
/*o/p:-
10
20
*/