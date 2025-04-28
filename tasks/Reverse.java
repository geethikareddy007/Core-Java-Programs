class Reverse{   
	public static void main(String[] args){
		int n=3254, rev=0;
		while(n!=0){
			int rem=n%10;
			rev =(rev*10)+rem;
			n/=10;
		}
		System.out.println(rev);	//4523
	}
}	

/*2)WAP TO REVERSING A NUMBER ?*/
