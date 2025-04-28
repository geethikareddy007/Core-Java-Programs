class Q{
	P obj=new P();
	public static void main(String[] args){
	Q obj=new Q();
	System.out.println(obj.obj.j);
	System.out.println(obj.obj.i);		//as a non static in another class
	}
}
/*o/p:-
20
10
*/
	