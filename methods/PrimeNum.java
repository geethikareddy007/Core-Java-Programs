class PrimeNum{
	public static String prime(int n){
		int count=0;
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				count++;
		}
		if(count==0 && n>=2)
			return "It is a prime";
		else
			return "It is not a Prime";
	}
	public static void main(String[]args){
		int n=12;
		System.out.println(prime(n));	//o/p came
	}
}