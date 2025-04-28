class Pat34{
	public static void main(String[] args){
	char ch='a';
	int n=1, star=0;
		for(int i=1;i<=4;i++){
			star++;
			for(int j=1;j<=star;j++){
				if(i%2==1){
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
a
1 2
b c d
3 4 5 6
*/