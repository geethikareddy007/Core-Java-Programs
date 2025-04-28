class Pattern19{   
	public static void main(String[] args){
		char ch='a', ch1='$';
		int n=1;
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				if(j==3){
					System.out.print(ch1 +" ");
				}else if(!(j%2==0)){
					System.out.print(ch++ +" ");
				}else{
					System.out.print(n++ +" ");
				}
			}
			System.out.println();	//o/p came
		}
	}
}

/*
a 1 $ 2 b
c 3 $ 4 d
e 5 $ 6 f
g 7 $ 8 h
i 9 $ 10 j
*/