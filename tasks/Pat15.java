class Pat15{
	public static void main(String[] args){
		char ch='i';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(ch=='a'){
					System.out.print(ch+" ");
					ch='i';
				}else{
					System.out.print(ch+" ");
					ch--;
				}
			}
			System.out.println();	//o/p came
		}
	}
}

/*
i h g f
e d c b
a i h g
f e d c
*/