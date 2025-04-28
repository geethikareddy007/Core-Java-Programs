class RecursionSum{
	public static void main(String[] args){
		int sum=sum(1,5);
		System.out.println(sum);
	}
	public static int sum(int a, int b){
		if(a==b){
			return b;
		}else{
			return a+sum(a+1,b);
		}
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