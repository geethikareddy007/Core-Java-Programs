class FormFibonocciNum{   
	public static void main(String[] args){
		int n=56348712;
		int res=0, p=1;
		while(n!=0){
			int r=n%10;
			if(fib(r)){
				res=r*p+res;
				p*=10;
			}
			n/=10;
		}
		System.out.println(res);	//53812
	}
		public static boolean fib(int n){
			if(n==0) return true;
			int a=0,b=1,c=a+b;
			while(a+b<n){
				a=b;
				b=c;
				c=a+b;
			}
			return c==n;
		}
	}