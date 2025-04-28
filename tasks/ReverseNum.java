class ReverseNum{
	public static void main(String[] args){
		int n=564,rev=0, r=0;
		while(n!=0){
			r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		System.out.println(rev);	//465
	}
}


/*2)WAP TO REVERSE A NUMBER ?*/
