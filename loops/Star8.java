class Star8{   
	public static void main(String[] args){
		for(int i=1; i<=4;i++){
			for(int j=1; j<=4;j++){
			if((j==1||j==4)&&(j==i)){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
			}
		System.out.println();	//wrong o/p
		}
	}
}

//N
		
