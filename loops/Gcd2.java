class Gcd2{   
	public static void main(String[] args){
		int a=16, b=20,c=30;
		int min=(a<b && a<c)?a:(b<c)?b:c;
		int gcd=1;
		for(int i=min; i>=1; i--){
			if(a%i==0 && b%i==0 && c%i==0){
			gcd =i;
			break;
			}
		}
		System.out.println(gcd);	//2
	}
}