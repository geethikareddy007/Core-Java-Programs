class Pat44{
	public static void main(String[] args){
		int star=5,space=4,star1=0;
		for(int i=1;i<=4;i++){
			star--;
			space--;
			star1++;
			for(int j=1;j<=star1;j++){
				System.out.print("* ");
			}
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
*       * * * *
* *     * * *
* * *   * *
* * * * *
*/