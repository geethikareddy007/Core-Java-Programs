class Automorphic{
	public static void main(String[] args){
		int n=25;
		int s=n*n; 
		boolean flag=true;
		while(n!=0){
		if(n%10!=s%10){
			flag=false;
			break;
		}
		n/=10;
		s/=10;
		}
		if (flag){
			System.out.println("Automorphic Number"); //crt o/p came
		}else{
			System.out.println("is not a Automorphic Number");
		}
	}
}



