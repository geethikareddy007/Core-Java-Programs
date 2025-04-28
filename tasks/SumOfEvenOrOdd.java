class SumOfEvenOrOdd{   
	public static void main(String[] args){
		int n=25,sum=0,r=0;
		while(n!=0){
			r=n%10;
			sum=sum+r;
			n/=10;
		}
		if(sum%2==0)
			System.out.println(sum+" is Even");
		else
			System.out.println(sum+" is Odd");	//o/p came
	}
}

/*8)WAP TO CHECK WHETHER SUMATION OF THE NUMBER IS 
EVEN OR ODD ?*/
