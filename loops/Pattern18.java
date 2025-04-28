class Pattern18{   
	public static void main(String[] args){
		char ch='#';
		int n=1;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=4; j++){
				if(i==j || i+j==5){
					System.out.print(n++ +" ");
				}else{
					System.out.print(ch+" ");
				}
			}
			System.out.println();	//o/p came
		}
	}
}

/*
1 # # 2
# 3 4 #
# 5 6 #
7 # # 8
*/