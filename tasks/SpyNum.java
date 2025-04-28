class SpyNum{
	public static void main(String[] args){
		int n=312, t=n,r=0;
		int sum=0, pro=1;
		while(n!=0){
			r=n%10;
			sum=sum+r;
			pro=pro*r;
			n/=10;
		}
		if(sum==pro){
			System.out.println(t+"is Spy Number");	//o/p came
		}else{
			System.out.println(t+"is not Spy Number");	
		}
	}
}

/*6)WAP TO CHECK WHETHER GIVEN NUMBER IS A SPY NUMBER 
OR NOT ? */