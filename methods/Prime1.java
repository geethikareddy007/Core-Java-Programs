class Prime1{
		public static boolean prime(int n){
			int c=0;
			for(int i=1;i<=n;i++){
			if(n%i==0)
				c++;
			}
			return c==2;
		}
		public static void main(String[] args){
			int m=1, n=100;
			for(int i=m;i<=n;i++){
				if(prime(i))
				System.out.println(i);		//o/p came
			}
		}
	}

		
		