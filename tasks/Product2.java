class Product2{
	public static void main(String[] args){
		int n=45,r=0,p=1;
		while(n!=0){
			r=n%10;
			p=p*r;
			n/=10;
		}
		System.out.println(p);	//o/p came
	}
}

/*5)WAP TO PRINT THE PRODUCT OF THE NUMBER ?*/