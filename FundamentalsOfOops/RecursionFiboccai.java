class RecursionFiboccai{
	public static void main(String[] args){
		int a=0,b=1,c=100;
		System.out.println(a);
		System.out.println(b);
		fibo(a,b,c);
	}
	public static void fibo(int a, int b, int c){
		int res=a+b;
		if(res<=c){
			System.out.println(res);
			fibo(b,res,c);
		}
	}
}
/*o/p:-
0
1
1
2
3
5
8
13
21
34
55
89
*/