class Pat35{
	public static void main(String[] args){
	int star=0;
		for(int i=1;i<=4;i++){
			char ch='a';
			int n=1;
			star++;
			for(int j=1;j<=star;j++){
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
1
a b
1 2 3
a b c d
*/