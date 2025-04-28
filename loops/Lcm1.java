class Lcm1{   
	public static void main(String[] args){
		int a=20, b=10;
		int max=(a>b)?a:b;
		int lcm=max, i=2;
		while(true){
			if(lcm%a==0 && lcm%b==0){
			System.out.println(lcm); 	//20
			break;
		}
		lcm = max * i++;
		}
	}
}