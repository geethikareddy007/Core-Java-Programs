class Pat51{
	public static void main(String[] args){
		int star=9,space=0;
		for(int i=1;i<=4;i++){
			int num=1;
			star-=2;
			space++;
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++){
				if(j+i<=4)
					System.out.print(num++ +" ");
				else
					System.out.print(num-- +" ");
			}
			System.out.println();	//o/p came
		}
	}
}
/*
  1 2 3 4 3 2 1
    1 2 3 2 1
      1 2 1
        1
*/