class RecursionExp{
	public static void main(String[] args){
			System.out.println("MB");
		test (4);
		System.out.println("ME");
	}
	public static void test(int n){
		
		System.out.println(n);
		n--;
		if(n>0){
			test(n);
		}
		System.out.println(n);	
	}
}
/*o/p:-
MB
4
3
2
1
0
1
2
3
ME
*/