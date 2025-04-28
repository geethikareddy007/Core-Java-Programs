class HarshadNum{   
	public static void main(String[] args){
		int m=100,n=160;
		for(int i=m; i<=n;i++){
			if(isHarshad(i))
				System.out.println(i);		//o/p came
			}
		}
		public static boolean isHarshad(int n){
			int sum=0,t=n;
			while(n!=0){
				int r=n%10;
				sum+=r;
				n/=10;
			}
			return t%sum==0;	
		}
	}
		

			
		