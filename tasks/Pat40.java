class Pat40{
	public static void main(String[] args){
		int star=0,num=0,temp=1;
		for(int i=1;i<=4;i++){
			num+=i;
			star++;
			temp=num;
			for(int j=1;j<=star;j++){
				System.out.print(temp);
				temp--;
			}
			System.out.println();	//o/p came
		}
	}
}
/*
1
32
654
10987
*/