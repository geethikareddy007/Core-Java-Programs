class PerfectSquare{
	public static void main(String[] args){
		int n=49;
		boolean flag=false;
		for(int i=2;i<=n/2;i++){
			if(i*i==n){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println(n+" is perfect square");		//o/p came
		}else{
			System.out.println(n+" is not perfect square");
		}
	}
}

/*8)WAP TO CHECK WHETHER GIVEN NUMBER IS A PERFECT 
SQUARE OR NOT ? */