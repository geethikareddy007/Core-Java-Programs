class Pat18{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
		char ch='A';
		int n=1;
			for(int j=1;j<=4;j++){
				if(i%2==0){
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
A B C D
1 2 3 4
A B C D
1 2 3 4
*/