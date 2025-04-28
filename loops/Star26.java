class Star26{   
	public static void main(String[] args){
		int star=1, space=3;
		for(int i=1; i<=7; i++){
			for(int j=1;j<=4;j++){
				if(i>2&&i<6)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=1;j<=star;j++){
			System.out.print("* ");
			}
			if(i<4){
				space--;
				star++;
			}else{
				space++;
				star--;
			}
			System.out.println();	//o/p came
			
		}
	}
}

/*       *
         * *
 * * * * * * *
 * * * * * * * *
 * * * * * * *
         * *
         *
