class Prime{
		public static boolean prime(int n){
			if(n<2)return false;
			for(int i=2;i<=n/2;i++){
				if(n%i==0)
					return false;
			}
			return true;
		}
		public static void main(String[] args){
			int m=1, n=200;
			for(int i=1; i<=n;i++){
				if(prime(i))
				System.out.print(i+" ,");	//o/p came
			}
		}
	} 

		