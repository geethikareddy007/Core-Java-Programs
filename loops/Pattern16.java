class Pattern16{   
	public static void main(String[] args){
		int space=3, star=1;
		char ch='a';
		for(int i=1; i<=8; i++){
			char ch1=ch;
			int n=1;
			for(int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++){
			if(i<=4){
				if(j<=star/2)
				System.out.print(ch1-- +" ");
				else
				System.out.print(ch1++ +" ");
			}
			else{
				System.out.print(n++ +" ");			
			}
			}
			System.out.println();
			if(i>=4){
				space=2;
				star=3;
			}else{
				star+=2;
				space--;
				ch++;		//o/p came
			}
		}
	}
}

/*      a
      b a b
    c b a b c
  d c b a b c d
      1 2 3
      1 2 3
      1 2 3		
*/ 
		