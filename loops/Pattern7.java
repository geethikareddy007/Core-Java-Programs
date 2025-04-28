class Pattern7{   
	public static void main(String[] args){
		int count=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(count+" ");
				count+=5;
			}
			
			System.out.println();		//o/p came
		}	
		
	}
}

/*1
  6 11
  16 21 26
  31 36 41 46*/