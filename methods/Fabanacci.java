class Fabanacci{
	public static boolean fibo(int n){
		if(n==0) return true;
		int a=0,b=1,c=a+b;
		while(a+b<=n){
			c=a+b;
			a=b;
			b=c;
		}
		return c==n;
	}
	public static void main(String[]args){
		int n=5;
		System.out.println(fibo(n));	//o/p came
	}
}
			
	