class IntToBinary{   
	public static void main(String[] args){
		int n=25;
		String res="";
		while(n!=0){
			int r=n%2;
			res=r+res;
			n=n/2;
		}
		System.out.println(res); 	//11001
	}
}