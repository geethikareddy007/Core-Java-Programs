class FormNumEven{   
	public static void main(String[] args){
		int n =458236;
		int res=0,p=1;
		while(n!=0){
			int r = n%10;
			if(r%2==0){
				res=r*p+res;
				p=p*10;
			}
			n=n/10;
		}
		System.out.println(res);  //4826
	}
}


		
				