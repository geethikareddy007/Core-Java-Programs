class Pat19{
	public static void main(String[] args){
		char ch='a';
		int n=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i%2==0){
					System.out.print(ch+" ");
					ch++;
				}else{
					System.out.print(n+" ");
					n++;
				}
			}
			System.out.println();	//o/p came
		}
	}
}
/*
1 2 3 4
a b c d
5 6 7 8
e f g h
*/
