class SpyNum2{
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
			System.out.println(t+"is Spy Number");	//o/p not came
		}else{
			System.out.println(t+"is not Spy Number");	
		}
	}
}


/*14)WAP TO PRINT SPY NUMBER BY READING IT'S POSITION OF 
NUMBER ?*/
