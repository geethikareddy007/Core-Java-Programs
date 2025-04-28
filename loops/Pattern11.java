class Pattern11{   
	public static void main(String[] args){
		int a=0, b=1, c=a+b;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4; j++){
				System.out.printf("%4d", a);
				a=b;
				b=c;
				c=a+b;
			}
			System.out.println();	//o/p came
		}
	}
}

/*   0   1   1   2
     3   5   8  13
    21  34  55  89
   144 233 377 610  fabonacci values*/
			
		