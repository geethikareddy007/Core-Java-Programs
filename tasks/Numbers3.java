class Numbers3{
	public static void main(String[] args){
		int m=50,n=70;
		int count=0;
		for(int i=m;i<=n;i++){
			int k=i;
			while(k!=0){
				if(k%10==6){
					count++;
					System.out.println(i);	//o/p came
					break;
				}
				k/=10;
			}
		}
	}
}
/*13)WAP TO PRINT HOW MANY NUMBERS HAVE 6 IN IT AND HOW 
MANY 6'S ARE PRESENT ?*/
