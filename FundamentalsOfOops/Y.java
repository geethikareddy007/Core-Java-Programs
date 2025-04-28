class Y{
	int a=10;
	static double d=3.99;
	{
		System.out.println("IIB-1");
	}
	public static void main(String[] args){
		System.out.println("MB");
		System.out.println(Y.d);
		d=3.1;
		Y obj=new Y();
		obj.a=15;
		obj.text();
		System.out.println("ME");
	}
	public void text(){
		System.out.println("TB");
		System.out.println(a);
		String a="java";
		System.out.println(a);
		System.out.println(this);
		System.out.println(this.d);
		System.out.println("TE");
	}
}
/*o/p:-
MB
3.99
IIB-1
TB
15
java
Y@4517d9a3
3.1
TE
ME
*/