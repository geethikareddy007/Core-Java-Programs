class Pat23{
	public static void main(String[] args){
		char ch='a';
		int n=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j%2==0){
					System.out.print(n+" ");
					n++;
				}else if(i==5&&j==5){
					System.out.print('j'+" ");
				}else if(i==5&&j==3){
					System.out.print('+'+" ");
				}else if(i==5&&j==1){
					System.out.print('i'+" ");
				}else{
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();	//o/p came
		}
	}
}
/*
a 1 b 2 c
d 3 e 4 f
g 5 h 6 i
j 7 k 8 l
i 9 + 10 j
*/