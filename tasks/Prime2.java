class Prime2{
	public static void main(String[] args){
		int n=14, count=0;
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				count++;
		}
		if(count==0 && n>1)
			System.out.println(n+" is prime number");	
		else
			System.out.println(n+" is not prime number");	//o/p not came
	}
}

/*13)WAP TO PRINT PRIME NUMBER BY READING IT'S POSITION OF 
NUMBER ?*/