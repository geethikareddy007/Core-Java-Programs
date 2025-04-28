class NeonNumber{
	public static void main(String[] args){
		int n=9;
		int s=n*n;
		int sum=0;
		while(s!=0){
			sum+=s%10;
			s/=10;
		}
		if(sum==n){
			System.out.println(n+" is a Neon number");   // crt o/p came
		}else{
			System.out.println(n+" is not a Neon number");
		}
	}
}
		
			