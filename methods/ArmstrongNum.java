class ArmstrongNum{
	public static void main(String[] args){
	int m=100, n=1000;
	for(int i=m;i<=n;i++){
		if (armstrong(i))
			System.out.println(i);	//o/p came eg:- 153,370,371,407
		}
	}

	public static boolean armstrong(int n){
		int sum=0, t=n;
		int c=count(n);
		while(n!=0){
			int r =n%10;
			sum+=power(r,c);
			n/=10;
		}
		return sum==t;
	}
	public static int count(int n){
		int c=0;
		while(n!=0){
			n/=10;
			c++;
		}
		return c;
	}
	public static int power(int a, int b){
		int p=1;
		for(int i=1;i<=b;i++){
			p=p*a;
		}
		return p;
	}
}
			