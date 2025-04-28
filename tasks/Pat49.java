class Pat49{
	public static void main(String[] args){
		int star=-1,space=4,n=0;
		for(int i=1;i<=7;i++){
			if(i<=4){
				star+=2;
				space--; n++;
			}else{
				space++;
				star-=2; n--;
			}
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++){
				System.out.print(n+" ");
			}
			System.out.println();	//o/p came
		}
	}
}
/*
      1
    2 2 2
  3 3 3 3 3
4 4 4 4 4 4 4
  3 3 3 3 3
    2 2 2
      1
*/