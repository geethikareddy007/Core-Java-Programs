class BinaryValues{   
	public static void main(String[] args){
		int m=2, n=10;
		for(int i=m;i<=n;i++){
			String s=(binary(i));
			System.out.println(s);	//o/p came
		}
	}
	public static String binary(int n){
		String res="";
		while(n!=0){
			int r=n%2;
			res=r+res;
			n/=2;
		}
		return res;
	}
}

/*binary values b/w m and n.*/