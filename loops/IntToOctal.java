class DecimalToOctal{   
	public static void main(String[] args){
		int n=25;
		String res="";
		while(n!=0){
			int r=n%8;
			res =r+res;
			n=n/8;
		}
		System.out.println(res); 	
	}
}
			