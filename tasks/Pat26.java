class Pat26{
	public static void main(String[] args){
		int n=1;
		char ch='a';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==0){
					System.out.print(ch+" ");
					ch+=3;
				}else{
					System.out.print(n+" ");
					n+=3;
				}
			}
			System.out.println();	//o/p came
		}
	}
}
/*
1 a 4 d
7 g 10 j
13 m 16 p
19 s 22 v
*/
				