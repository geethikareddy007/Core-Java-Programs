class Pat11{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==1&&j==1)
					System.out.print(8+" ");
				else if(i==1&&j==4)
					System.out.print(7+" ");
				else if(i==2&&j==2)
					System.out.print(6+" ");
				else if(i==2&&j==3)
					System.out.print(5+" ");
				else if(i==3&&j==2)
					System.out.print(4+" ");
				else if(i==3&&j==3)
					System.out.print(3+" ");
				else if(i==4&&j==1)
					System.out.print(2+" ");
				else if(i==4&&j==4)
					System.out.print(1+" ");
				else
					System.out.print('*'+" ");
			}
			System.out.println();	//o/p came
		}
	}
}
/*
8 * * 7
* 6 5 *
* 4 3 *
2 * * 1
*/