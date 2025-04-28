class Sum{   
	public static void main(String[] args){
		int n=35,sum=0,r=0;
		while(n!=0){
			r=n%10;
			sum=sum+r;
			n/=10;
		}
			System.out.println(sum);	//o/p came
	}
}

/*6)WAP TO PRINT THE SUMMATIOM OF THE NUMBER ?*/
