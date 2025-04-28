class Pat41{
	public static void main(String[] args){
		int star=0,space=7;
		for(int i=1;i<=4;i++){
			star++;
			space-=2;
			for(int j=1;j<=star;j++){
				System.out.print("* ");
			}
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++){
				if(!(i==4&&j==4)){
					System.out.print("* ");
				}
			}
			System.out.println();	//o/p came
		}
	}
}
/*
*           *
* *       * *
* * *   * * *
* * * * * * *
*/