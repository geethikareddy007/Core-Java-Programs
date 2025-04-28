class SumOfSq{
	public static void main(String[] args){
		int n=23;
		System.out.println(SumOfSq(n));	//o/p came
	}
	public static int SumOfSq(int n){
		int sum=0;
		while(n!=0){
		int r=n%10;
		int sq=r*r;
		sum=sum+sq;
		n/=10;
		}
		return sum;
	}
}	