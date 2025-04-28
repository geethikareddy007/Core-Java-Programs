class Numbers1{   
	public static void main(String[] args){
		int m=2,n=20;
		int count=0;
		for (int i=m;i<=n;i++){
			int k=i;
		while(k!=0){
			if(k%10==5){
				count++;
			}
			k/=10;
		}
		}
		System.out.println(count);	//o/p came
	}
}
/*11)WAP TO COUNT NUMBERS BETWEEN M AND N THE NUMBER 
WHICH HAS 5 IN IT ?*/
