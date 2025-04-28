class SpyNumber{
	public static void main(String[] args){
		int n=321, t=n;
		int sum=0;
		int product=1;
		while(n!=0){
			int r=n%10;
			sum+=r;
			product*=r;
			n=n/10;
		}
		if (sum==product){
			System.out.println(t+" is spy number");		//o/p came
		}else{
			System.out.println(t+" is not a spy number");	
		}
	}
}