class Pat21{
	public static void main(String[] args){
		char ch='a';
		int n=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==0){
					System.out.print(ch+" ");
					
				}else{
					System.out.print(n+" ");
				}
			}
			System.out.println();	//o/p came
		}
	}
}
/*
1 a 1 a
1 a 1 a
1 a 1 a
1 a 1 a
*/