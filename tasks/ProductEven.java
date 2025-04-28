class ProductEven{   
	public static void main(String[] args){
		int m = 1, n=7;
		int pro=1;
		
		while(m<=n){
			if(m%2==0)
			pro*=m;
			m++;		
			
		}
		System.out.println(pro);	//48
	}
}
/*15)WAP TO PRINT PRODUCT OF EVEN NUMBRS BETWEEN M AND N ?*/