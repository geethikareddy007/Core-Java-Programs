class Numbers2{
	public static void main(String[] args){
		int m=30,n=40;
		int count=0;
		for(int i=m;i<=n;i++){
			int k=i;
			while(k!=0){
				if(k%10==3){
					count++;
					System.out.println(i);	
					break;
				}
				k/=10;
			}
		}
		System.out.println(count);		//o/p came
	}
}


/*12)WAP TO COUNT HOW MANY 3 ARE PRESENT IN BETWEN M AND 
N ?*/