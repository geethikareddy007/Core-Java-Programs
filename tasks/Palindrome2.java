class Palindrome2{
	public static void main(String[] args){
		int n=564,rev=0, r=0,t=n;
		while(n!=0){
			r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		if(t==rev){
			System.out.println(t+"is a palindrome");
		}else{
			System.out.println(t+"is not a palindrome");	//o/p came
		}
	}
}

/*3)WAP TO CHECK WHETHER GIVEN NUMBER IS PALINDROME OR 
NOT ?*/