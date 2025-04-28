class HarshadNum{   
		public static boolean harshad(int n){
			int sum=0,t=n;
			while(n!=0){
				sum+=n%10;
				n/=10;
			}
			return t%sum==0;
		}
		public static void main(String[] args){
			int m=1,n=160;
			for(int i=m; i<=n;i++){
				if(harshad(i))
				System.out.println(i);
			}
		}
	}

			
		