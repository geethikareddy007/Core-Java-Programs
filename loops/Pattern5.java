class Pattern5{   
	public static void main(String[] args){
		int k;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				k=i+j-1;
				if(k>4)
					k=k-4;
				System.out.print(k+" ");
			}
			System.out.println();	//o/p came
		}	
		
	}
}

/*1 2 3 4
  2 3 4 1
  3 4 1 2
  4 1 2 3 */