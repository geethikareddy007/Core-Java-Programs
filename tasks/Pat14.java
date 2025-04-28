class Pat14{
	public static void main(String[] args){
		int n=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(n==9){
					System.out.print(n+" ");
					n=1;
				}
				else{
					System.out.print(n+" ");
					n++;
				}
			}
			System.out.println();	//o/p came
		}	
	}
}
		
		
/*
1 2 3 4
5 6 7 8
9 1 2 3
4 5 6 7
*/