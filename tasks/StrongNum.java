class StrongNum{
	public static void main(String[] args){
		int n=145, t=n;
		int sum=0;
		while(n!=0){
			int r=n%10, fact=1;
			for(int i=1;i<=r;i++){
			fact*=i;
			}
			sum=sum+fact;
			n/=10;
			
		}
		if(sum==t)
			System.out.println(t+" is Strong Number");
		else
			System.out.println(t+" is not Strong Number");	//o/p came
	}
}
	
/*10)WAP TO CHECK WHETHER GIVEN NUMBER IS STRONG 
NUMBER OR NOT ?*/