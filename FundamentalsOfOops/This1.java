class This1{
	static int i=10;
	int j=20;
	static{
		System.out.println(i);
		System.out.println(This1.i);
		This1 obj=new This1();
		System.out.println(obj.i);
		System.out.println(obj.j);
	}
	{
		System.out.println(j);
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this);
	}
	public void run(){
		System.out.println(this);
		System.out.println(j);
		System.out.println(this.j);
		System.out.println(this.i);
	}
	public static void main(String[] args){
		This1 obj=new This1();
		System.out.println(obj);
	}
}
/*o/p:-
10
10
20
10
20
This1@4617c264
10
20
20
10
20
This1@36baf30c
This1@36baf30c
*/