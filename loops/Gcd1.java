class Gcd1{   
	public static void main(String[] args){
		int a=16, b=40;
		int min=(a>b)?b:a;
		int gcd=1;
		for(int i=min; i>=1; i--){
			if(a%i==0 && b%i==0){
			gcd =i;
			break;
			}
		}
		System.out.println(gcd);	//8
	}
}