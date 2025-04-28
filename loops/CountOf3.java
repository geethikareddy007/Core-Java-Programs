class CountOf3{
	public static void main(String[] args){
		int m=20,n=40;
		int c=0;
		for(int i=m;i<=n; i++){
			int k=i;
			while(k!=0){
				if(k%10==3){
				c++;
			}
			k/=10;
			}
			System.out.println(c); 	//o/p not came
			}
		}
	}