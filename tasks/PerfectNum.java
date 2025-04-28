class PerfectNum{
	public static void main(String[] args){
		int n=6;
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		if(sum==n){
			System.out.println(n+" is Perfect number");	//o/p came
		}else{
			System.out.println(n+" is not a perfect number");
		}
	}	
	
}
	
/*7)WAP TO CHECK WHETHER GIVEN NUMBER IS A PERFECT 
NUMBER OR NOT ?*/