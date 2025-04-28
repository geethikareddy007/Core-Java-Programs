class SunnyNumber{   
	public static void main(String[] args){
		int n=35, m=n+1;
		boolean flag=false;
		for(int i=2;i<=m/2; i++){
			if(i*i ==m){
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println(n + "is Sunny number");	//o/p came
		}else{
			System.out.println(n + "is not a sunny number");
		}
	}
}