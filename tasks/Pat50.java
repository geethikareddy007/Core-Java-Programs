class Pat50{
	public static void main(String[] args){
		int star=-1,space=4;
		for(int i=1;i<=4;i++){
			char  ch='A';
			star+=2;
			space--;
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++){
				if(i>j&&((i+j)<8))
					System.out.print(ch++ +" ");
				else
					System.out.print(ch-- +" ");
			}
			System.out.println();	//o/p came
		}
	}
}
/*
      A
    A B A
  A B C B A
A B C D C B A
*/