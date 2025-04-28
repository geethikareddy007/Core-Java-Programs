class Pat32{
	public static void main(String[] args){
	int n=0; char ch='a';
		for(int i=1;i<=4;i++){
			n++;
			for(int j=1;j<=n;j++){
				System.out.print(ch);
				ch++;
			}
			System.out.println();	//o/p came
		}
	}
}
/*
a
bc
def
ghij
*/