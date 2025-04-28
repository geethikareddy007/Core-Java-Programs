class Armstrong{
		public static void main(String[] args){
			int n=1634, t=n;
			int sum=0;
			int c=count(n);
			while(n!=0){
				int r=n%10;
				sum+=power(r,c);
				n/=10;
			}
			if(t==sum)
				System.out.println(t+" is a Armstrong number");
			else
				System.out.println(t+" is not a Armstrong number");		//o/p came
		}
		public static int count(int n){
			int c=0;
			while(n!=0){
				c++;
				n/=10;
			}
			return c;
		}
		public static int power(int a, int b){
			int p=1;
			for(int i=1;i<=b;i++){
				p=p*a;
			}
			return p;
		}
	}
		