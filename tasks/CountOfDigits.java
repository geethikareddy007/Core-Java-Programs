class CountOfDigits{   
	public static void main(String[] args){
		int n=3254, rem=0,count=0;
		while(n!=0){
			rem=n%10;
			count++;
			n/=10;
		}
		System.out.println(count);	//o/p came
	}
}
			
/*1) WAP TO COUNT DIGITS PRESENT IN A NUMBER ?*/