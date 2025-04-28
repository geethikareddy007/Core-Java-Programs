class Ascending{
	public static void main(String[] args){
		int res=0;
		for(int i=1;i<=9;i++){
			int n =251;
			while(n>0){
			int rem=n%10;
			if(rem==i)
				res=res*10+rem;
				n/=10;
			}
		}
		System.out.println(res);	//o/p came
	}
}
			