class Pat20{
	public static void main(String[] args){
		char ch='A';
		int n=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==0){
					System.out.print(n+" ");
					n++;
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
A 1 B 2
C 3 D 4
E 5 F 6
G 7 H 8
*/