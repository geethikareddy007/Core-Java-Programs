class Pat3{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==3&&j==1)
					System.out.print('^'+" ");
				else if(i==4&&j==4)
					System.out.print('@'+" ");
				else
					System.out.print(0+" ");
				
			}
			System.out.println();	//o/p came
		}
	}
}

/*
0 0 0 0
0 0 0 0
^ 0 0 0
0 0 0 @
*/