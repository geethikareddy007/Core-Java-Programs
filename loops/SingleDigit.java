class SingleDigit{   
	public static void main(String[] args){
		int n=289;
		while(n>9){
			int sum=0;
			while(n!=0){
				sum=sum+n%10;
				n/=10;
			}
			n=sum;
		}
		System.out.println(n);  //1
	}
}
	
	
	
//n=289
//2+8+9=19
//1+9=10
//1+=1
		
		