class OctalValues{   
	public static void main(String[] args){
		int m=20, n=25;
		for(int i=m;i<=n;i++){
			String s=(octal(i));
			System.out.println(s);	//o/p came
		}
	}
	public static String octal(int n){
		String res="";
		while(n!=0){
			int r=n%8;
			res=r+res;
			n/=8;
		}
		return res;
	}
}