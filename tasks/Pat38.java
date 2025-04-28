class Pat38{
	public static void main(String[] args){
		int star=6;
		for(int i=1;i<=5;i++){
		char ch='a';
			star--;
			int n=5;
			for(int j=1;j<=star;j++){
				if(i%2==0){
					System.out.print(ch);
					ch++;
				}else{
					System.out.print(n);
					n--;
				}
			}
			System.out.println();	//o/p came
		}
	}
}
/*
54321
abcd
543
ab
5
*/