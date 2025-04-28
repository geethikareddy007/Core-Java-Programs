class PrimeRange{
	public static void main(String[] args){
			int m=2,n=100;
		for(int i=m;i<=n;i++){
			if(prime(i))
				System.out.println(i);	//o/p came
		}
	}
	public static boolean prime(int n){
		int c=0;
		for(int i=1;i<=n;i++){
			if(n%i==0)
			c++;
		}
		if(c==2)
			return true;
		else
			return false;
	}
}
		
	

/*23)WAP TO PRINT PRIME NUMBERS BEETWEEN M AND N ?*/
