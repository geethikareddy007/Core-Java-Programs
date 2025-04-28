class RecursionFact{
	public static void main(String[] args){
		int fact=fact(6);
		System.out.println(fact);	//720
	}
	public static int fact(int n){
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
}