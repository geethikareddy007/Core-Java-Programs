class Pat25{
	public static void main(String[] args){
		int n=1;
		char ch='z';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=4;j++){
				if(j%2==0){
					System.out.print(ch);
					ch--;
				}else if(i==5&&j==3){
					System.out.print(1);
				}else{
					System.out.print(n);
					n++;
				}
			}
			System.out.println();	//o/p came
		}
	}
}
/*
1z2y
3x4w
5v6u
7t8s
9r1q
*/