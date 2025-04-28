class PalindromeNum{   
	public static void main(String[] args){
		int n=122, rem=0,rev=0,t=n;
		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		if(t==rev){
			System.out.println(t+"is a palindrome");
			}else{
				System.out.println(t+"is not a palindrome");	//o/p came
			}
		}
	}

/*7)WAP TO CHECK WHETHER GIVEN NUMBER IS 
PALINDROME OR NOT ?*/