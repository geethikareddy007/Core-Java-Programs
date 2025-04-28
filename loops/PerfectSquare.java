class PerfectSquare{   
	public static void main(String[] args){
		int n=16;
		boolean flag=false;
		for(int i=2; i<=n/2 && i*i<=n; i++){
			if(i*i ==n){
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println(n + "is perfect square");	//o/p came
		}else{
			System.out.println(n + "is not a perfect square");
		}
	}
}