class BinaryToOctal{   
	public static void main(String[] args){
		int n=110101;
		int res=0, p=1;
		while(n!=0){
			int r=n%10;
			res=res+(p*r);
			p=p*8;
			
		}
		System.out.println(res);	//
	}
}