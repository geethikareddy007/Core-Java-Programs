class Pat4{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==1&&j==4)
					System.out.print('*'+" ");
				else if(i==3&&j==3)
					System.out.print('$'+" ");
				else
					System.out.print('a'+" ");
				
			}
			System.out.println();	//o/p came
		}
	}
}

/*
a a a *
a a a a
a a $ a
a a a a
*/