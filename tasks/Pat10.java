class Pat10{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==1&&j==1)
					System.out.print('a'+" ");
				else if(i==1&&j==5)
					System.out.print('b'+" ");
				else if(i==2&&j==2)
					System.out.print('c'+" ");
				else if(i==2&&j==4)
					System.out.print('d'+" ");
				else if(i==3&&j==3)
					System.out.print('f'+" ");
				else if(i==4&&j==2)
					System.out.print('g'+" ");
				else if(i==4&&j==4)
					System.out.print('h'+" ");
				else if(i==5&&j==1)
					System.out.print('i'+" ");
				else if(i==5&&j==5)
					System.out.print('j'+" ");
				else
					System.out.print('*'+" ");
			}
			System.out.println();	//o/p came
		}
	}
}
/*
a * * * b
* c * d *
* * f * *
* g * h *
i * * * j
*/