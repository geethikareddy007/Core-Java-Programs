class NumConversions{   
	public static void main(String[] args){
		int m=1,n=20;
		for(int i=m;i<=n;i++){
			System.out.println(i + "-" + bin(i)+"-" + octal(i) + "-" + hex(i));	//o/p came
		}
	}
	public static String bin(int n){
		String res="";
		while(n!=0){
			int r=n%2;
			res=r+res;
			n/=2;
		}
		return res;
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
	public static String hex(int n){
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