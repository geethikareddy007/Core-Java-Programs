class Pat37{
	public static void main(String[] args){
		int star=6,space=-1;
		for(int i=1;i<=5;i++){
		char ch='e';
			star--;
			space++;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print(ch);
				ch--;
			}
			System.out.println();	//o/p came
		}
	}
}
/*
edcba
 edcb
  edc
   ed
    e
*/