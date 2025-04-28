class HexaDecValues{   
	public static void main(String[] args){
		int m=50, n=100;
		for(int i=m;i<=n;i++){
			String s=(hexadec(i));
			System.out.println(s);	//o/p came
		}
	}
	public static String hexadec(int n){
		String res="";
		while(n!=0){
			int r=n%16;
			if(r<10){
				res=r+res;
			}else{
				res=(char)(r+55)+res;
			}
			n/=16;
		}
		return res;
	}
}
			