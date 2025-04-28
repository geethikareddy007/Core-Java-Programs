class Pattern17{   
	public static void main(String[] args){
		char ch='a', ch1='@';
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				if(i==j || i+j==6){
					System.out.print(ch++ +" ");
				}else{
					System.out.print(ch1+" ");
				}
			}
			System.out.println();	//o/p came
		}
	}
}

/*
a @ @ @ b
@ c @ d @
@ @ e @ @
@ f @ g @
h @ @ @ i
*/