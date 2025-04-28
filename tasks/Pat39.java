class Pat39{
	public static void main(String[] args){
		int star=0;
		for(int i=1;i<=5;i++){
		char ch='e';
			star++;
			for(int j=1;j<=star;j++){
				System.out.print(ch);
				ch--;
			}
			System.out.println();	//o/p came
		}
	}
}
/*
e
ed
edc
edcb
edcba
*/