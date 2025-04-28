class B{
	static A obj=new A();
	public static void main(String[] args){
		A obj=new A();
		System.out.println(B.obj.j);
		System.out.println(B.obj.i);	//as a static variable in another class
	}
}
/*o/p:-
20
10
*/