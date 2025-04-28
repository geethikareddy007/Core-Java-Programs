class Strong{
		public static void main(String[] args){
			int m=100, n=100000;
			for(int i=m; i<=n; i++){
				if(isstrong(i))
				System.out.println(i);		//o/p came
			}
		}
		public static boolean isstrong(int n){
			int sum=0, t=n;
			while(n!=0){
				int r=n%10;
				sum+=fact(r);
				n/=10;
			}
			return sum==t;
		}
		public static int fact(int n){
			int fact=1;
			for(int i=1;i<=n;i++){
				fact*=i;
			}
			return fact;
		}
	}	
	