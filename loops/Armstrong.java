class Armstrong{   
	public static void main(String[] args){
		int n=123, t=n;
		int c=0;
		while(n!=0){
			c++;
			n/=10;
		}
		n=t;
		int sum=0;
		while(n!=0){
			int r=n%10;
			int p=1;
			for(int i=1; i<=c; i++){
				p=p*r;
			}
			sum+=p;
			n/=10;
		}
		if (sum==t){
			System.out.println(t+"is Armstrong number");
		}else{
			System.out.println(t+"is not a Armstrong number");  // o/p came
		}
	}
}
			
		
		
		