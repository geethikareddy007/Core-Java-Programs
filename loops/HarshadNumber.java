class HarshadNumber{
	public static void main(String[] args){
		int n=24, t=n;
		int sum=0;
		while(n!=0){
			int r=n%10;
			sum+=r;
			n=n/10;
		}
		
		if(t%sum==0){
			System.out.println(t+" is a Harshad number");
		}else{
			System.out.println(t+" is not a Harshad number");	//o/p came
		}
	}
}