class StrongNumber{
	public static void main(String[] args){
		int n=145, t=n,sum=0;
		while(n!=0){
			int r=n%10,fact =1;
			for(int i=1;i<=r;i++){
				fact*=i;
			}
			sum+=fact;
			n=n/10;
		}
		if(sum==t)
			System.out.println(t+" is strong number");
		else
			System.out.println(t+" is not a strong number");	//o/p came
	}
}	