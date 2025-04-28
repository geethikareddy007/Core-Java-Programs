class Pattern14{   
	public static void main(String[] args){
		char ch='a';
		int n=2;
		for(int i=1; i<=3;i++){
			for(int j=1; j<=4;j++){
				if(j%2==1){
				System.out.print(ch+" ");
				ch+=2;
				}else{
				System.out.print(n+" ");
				n+=2;
				}
			}
			System.out.println();		//o/p came
		}
	}
}

/*a 2 c 4
  e 6 g 8
  i 10 k 12 */