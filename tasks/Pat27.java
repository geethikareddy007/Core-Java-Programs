class Pat27{
	public static void main(String[] args){
		int n=1;
		char ch='A';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j==3||i==3){
					System.out.print('#');
				}else if(j==2||j==4){
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
1A#B2
3C#D4
#####
5E#F6
7G#H8
*/