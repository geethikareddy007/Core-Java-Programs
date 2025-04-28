class Quotient2{   
	public static void main(String[] args){
		int m=20, n=2;
		int count=0;
		for ( ; ; ){
			m=m-n;
			count++;
			if(m<n)
				break;
		}
		System.out.println(count);	//o/p came
	}
}

/*24)WAP TO PRINT THE QUOTIENT OF THE NUMBER WITHOUT 
USING ANY DIVISION OPERATORS ? */
