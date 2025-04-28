class Count1{
	public static void main(String[] args){
		int n=2564;
		System.out.println(count(n));	//o/p came
	}
	public static int count(int n){
		int count=0, r=0;
		while(n!=0){
		r=n%10;
		count++;
		n/=10;
		}
		return count;
	}
}		