class Pattern20{   
	public static void main(String[] args){
		int space=2, value=1;
		for(int i=1; i<=5; i++){
			char ch='a';
		for(int j=1; j<=space; j++){
			System.out.print("  ");
		}
		for(int j=1; j<=value; j++){
			if(j<=value/2){
			System.out.print(ch++ +" ");
			}else{
			System.out.print(ch-- +" ");
			}
		}
			System.out.println();
			if(i<3){
				space--;
				value+=2;
			}else{
				space++;
				value-=2;	//o/p came
			}
		}
	}
}

/*
    a
  a b a
a b c b a
  a b a
    a
*/