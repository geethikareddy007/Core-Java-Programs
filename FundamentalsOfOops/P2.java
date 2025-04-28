class P2{
	int i=10;
	{
	System.out.println(i);
	System.out.println(this.i);
	run();
	}
	public void run(){
		System.out.println(i);
		System.out.println(this.i);
	}
	public static void main(String[] args){
		P2 obj=new P2();
		obj.run();
	}
}
/*o/p:-
10
10
10
10
10
10
*/