class Sum2{
	public static void main(String[] args){
		int n=45,r=0,sum=0;
		while(n!=0){
			r=n%10;
			sum=sum+r;
			n/=10;
		}
		System.out.println(sum);	//o/p came
	}
}
			
/*4)WAP TO PRINT THE SUMMATION OF THE NUMBER ?*/