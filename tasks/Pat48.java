class Pat48{
	public static void main(String[] args){
		int star=-1,space=3;
		for(int i=1;i<=5;i++){
		char ch='A';
			if(i<=3){
				star+=2;
				space--;
			}else{
				space++;
				star-=2;
			}
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++){
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();	//o/p came
		}
	}
}
/*
    A
  A B C
A B C D E
  A B C
    A
*/