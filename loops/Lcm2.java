class Lcm2{   
	public static void main(String[] args){
		int a=20, b=40, c=15, d=30;
		int m1 = (a>b && a>c)?a:(b>c)?b:c;
		int max =(m1>d)?m1:d;
		int lcm=max, i=2;
		while(true){
			if(lcm%a==0 && lcm%b==0 && lcm%c==0 && lcm%d==0){
			System.out.println(lcm); 	//120
			break;
		}
		lcm = max * i++;
		}
	}
}