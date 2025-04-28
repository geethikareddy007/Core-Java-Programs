class Pat24{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			int n=1;
			char ch='a';
			for(int j=1;j<=5;j++){
				if(i%2==0){
					System.out.print(ch);
					ch++;
				}else if(i==3){
					System.out.print('+');
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
12345
abcde
+++++
abcde
12345
*/