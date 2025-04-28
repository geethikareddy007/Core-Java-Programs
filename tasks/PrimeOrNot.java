class PrimeOrNot{
	public static void main(String[] args){
		int n=7, count=0;
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				count++;
		}
		if(count==0 && n>1)
			System.out.println(n+" is prime number");	//o/p came
		else
			System.out.println(n+" is not prime number");
	}
}
		

/*12)WAP TO CHECK WHETHER GIVEN NUMBER IS PRIME NUMBER 
OR NOT ?*/