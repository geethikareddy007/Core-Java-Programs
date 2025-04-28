class Star14{   
	public static void main(String[] args){
		int star=1, space=3;
		for(int i=1; i<=7; i++){
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			System.out.println();
			if(1<4){
				star+=2;
				space--;
			}else{
				star-=2;
				space++;	//wrong o/p
			}
		}
	}
}

//      *
//    * * *
//  * * * * *
//* * * * * * *
//	* * * * *
//    * * *
//      * 		