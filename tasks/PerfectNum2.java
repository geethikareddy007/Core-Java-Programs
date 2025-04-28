class PerfectNum2{
	public static void main(String[] args){
		int n=28;
		int sum=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(sum==n){
			System.out.println(n+" is perfect number");		//o/p not came
		}else{
			System.out.println(n+" is not perfect number");
		}
	}
}

/*15)WAP TO PRINT PERFECT NUMBER BY READING IT'S POSITION 
OF NUMBER ?*/
