class ProductOfNum{   
	public static void main(String[] args){
		int n=17, p=1,r=0;
		while(n!=0){
			r=n%10;
			p=p*r;
			n/=10;
		}
		if(p%2==0)
			System.out.println(p+" is Even");
		else
			System.out.println(p+" is Odd");	//o/p came
	}
}
			

/*9)WAP TO CHECK WHETHER PRODUCT OF THE NUMBER IS EVEN 
OR ODD ?*/
