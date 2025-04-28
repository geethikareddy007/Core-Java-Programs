class PrimeRange1{
	public static boolean PrimeRange(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0)
				count++;
		}
		return count==2;
	}
	public static void main(String[]args){
		int m=1,n=100;
		for(int i=m;i<=n;i++){
			if(PrimeRange(i))
				System.out.println((i));
		}
	}
}