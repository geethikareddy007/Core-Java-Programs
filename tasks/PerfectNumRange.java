class PerfectNumRange{
	public static boolean perfect(int n){
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0)
				sum=sum+i;
		
		}
		if(sum==n)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		int m=1,n=200;
		for(int i=m;i<=n;i++){
			if(perfect(i))
				System.out.print(i+" ,");	//o/p came
		}
	}
}
/*o/p:- 6,28		

/*20)WAP TO PRINT PERFECT NUMBERS BETWEEN M AND N ?*/