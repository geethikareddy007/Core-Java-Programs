class Pat29{
	public static void main(String[] args){
	int star=5, space=-1;
		for(int i=1;i<=4;i++){
			space++;
			star--;
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("* ");
			}
			System.out.println();	//o/p came
			
		}
	}
}
/*
* * * *
  * * *
    * *
      *
*/