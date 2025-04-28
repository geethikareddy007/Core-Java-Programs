class Pattern9{   
	public static void main(String[] args){
		int space=3, val=1;
		for(int i=1; i<=7; i++){
			int n=1;
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=val; j++){
				if(j<=val/2){
				System.out.print(n++ +" ");
				}else{
				System.out.print(n-- +" ");
				}
			}
			System.out.println();		//o/p came
			if(i<4){
			space--;
			val+=2;
			}else{
			space++;
			val-=2;
			}
		
		}
	}
}

/*      1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
    1 2 3 2 1
      1 2 1
        1        */


