class IIB1{
	int j=20;
	static int i=10;
	{
	System.out.println(j);
	System.out.println(i);
	System.out.println(IIB1.i);
	}
	public static void main(String[] args){
		System.out.println(i);
		IIB1 obj=new IIB1();
		IIB1 obj1=new IIB1();
	}
}
/*o/p:-
10
20
10
10
20
10
10
*/