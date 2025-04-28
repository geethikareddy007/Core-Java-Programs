class Pat22{
	public static void main(String[] args){
		char ch='a';
		int n=1;
		for(int i=1;i<=4;i++){
			
			for(int j=1;j<=5;j++){
				if(j%2==0){
					System.out.print(n +" ");
					n++;
				}else if(j==3){
					System.out.print('+'+" ");
				}else {
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();	//o/p came
		}
	}
}
/*
a 1 + 2 b
c 3 + 4 d
e 5 + 6 f
g 7 + 8 h
*/