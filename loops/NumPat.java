class NumPat{
	public static void main(String[] args){
		int star=0;
		int n=1;
		for(int i=1;i<=5;i++){
			char ch='a';
			if(i<=3){
				star++;
				for(int j=1;j<=star;j++){
					System.out.print(n++);
				}
			}else{
				star--;
				for(int j=1;j<=star;j++){
					System.out.print(ch++);
				}
			}
			System.out.println();	//o/p came
		}
	}
}
/*
1
23
456
ab
a
*/
