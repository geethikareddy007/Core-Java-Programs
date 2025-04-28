class  Casting{
	public static void main(String[] args){
		P obj=new Q();	//Autoupcasting
		Q obj1=(Q)obj;	//Downcasting
		System.out.println(obj1.toString());	//obj class
		System.out.println(obj1.a);	//A
		System.out.println(obj1.c);	//B
	}
}

/*o/p:-
Q@2f92e0f4
10
30
*/
