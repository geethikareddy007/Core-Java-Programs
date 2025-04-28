class SpyNumRange{
	public static boolean spy(int n){
		int t=n,r=0;
		int sum=0, pro=1;
		while(n!=0){
			r=n%10;
			sum=sum+r;
			pro=pro*r;
			n/=10;
		}
		if(sum==pro)
			return true;	
		else
			return false;
	}
	public static void main(String[] args){
			int m=1,n=1000;
			for(int i=m;i<=n/2;i++){
				if(spy(i))
					System.out.println(i);		//o/p came
			}
	}
}

/*19)WAP TO PRINT SPY NUMBERS BEWEEN M AND N ?*/