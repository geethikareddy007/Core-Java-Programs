class SumOfDiv5{   
	public static void main(String[] args){
		int m=5, n=15;
		int sum=0;
		for(int i=m;i<=n;i++){
			if(m%5==0)
				sum+=m;
			m++;
			
		}
		System.out.println(sum);	//30
	}
}

/*22)WAP TO PRINT SUMMATION OF THE NUMBERS WHICH ARE 
DIVISABLE BY 5 BETWEEN M AND N ? */
