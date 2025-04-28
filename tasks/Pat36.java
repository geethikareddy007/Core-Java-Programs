class Pat36{
	public static void main(String[] args){
		int star=0,n=1;
		char ch='a';
		for(int i=1;i<=4;i++){
			star++;
			for(int j=1;j<=star;j++){
				if(j%2==0){
					System.out.print(ch);
					ch++;
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
1
2a
3b4
5c6d
*/