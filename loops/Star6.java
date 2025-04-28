class Star6{   
	public static void main(String[] args){
		int row=11, mid =(row/2)+1;
		for(int i=1; 1<=row; i++){
			for(int j=1; j<=row; j++){
				if((i==mid||j==mid)||(i==1&&j<=mid)||(j==1&&i>=mid)||(j==row&&i<=mid)||(j==row&&j==mid)){
				System.out.print("*");
				}
				else{
				System.out.print("");	//infinity loop coming
				}
			}
		}
	System.out.println();
	}
}


//11*11 swatik
