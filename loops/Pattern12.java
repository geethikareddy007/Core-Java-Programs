class Pattern12{   
	public static void main(String[] args){
		for(int i=1; i<=4;i++){
			char ch='a'; 
			int n=1;
			for(int j=1; j<=4;j++){
			if(j%2==1){
				System.out.print(ch+" ");
				ch++;
			}else{
				System.out.print(n+" ");
				n++;
			}
			}
			System.out.println();	//o/p came
			
		}
	}

}

/*a 1 b 2
  a 1 b 2
  a 1 b 2
  a 1 b 2 */
			
		
			