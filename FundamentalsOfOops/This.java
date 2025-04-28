class This{
	static int i=10;
	int j=20;
	static{
		System.out.println(i);
		System.out.println(This.i);
		This obj=new This();
		System.out.println(obj.i);
		System.out.println(obj.j);
	}
	{
		System.out.println(j);
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this);
	}
	public static void main(String[] args){
		This obj=new This();
		System.out.println(obj);
	}
}
/*o/p:-
10
10
20
10
20
This@4617c264
10
20
20
10
20
This@36baf30c
This@36baf30c
*/
		