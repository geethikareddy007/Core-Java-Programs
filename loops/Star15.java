class Star15{   
	public static void main(String[] args){
		int star=1, space=5;
		for(int i=7; i<=7; i++){
			for(int j=1; j<=star; j++){
				System.out.print("*");
			}
			for(int j=1; j<=space; j++){
				System.out.print(" ");
			}
			
			for(int j=1; j<=star; j++){
				if(!(i==4&&j==4))
					System.out.print("*");
			}
			System.out.println();
			if(1<4){
				star++;
				space-=2;
			}else{
				star--;
				space+=2;	//wrong o/p
			}
		}
	}
}

//*   		  *
//* *  	    * * 
//* * *	  * * *
//* * * * * * *
//* * *   * * *
//* *       * *
//*           *