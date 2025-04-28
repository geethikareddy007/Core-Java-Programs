class DecToHexadec{   
	public static void main(String[] args){
		int n=125;
		String res="";
		while(n!=0){
			int r=n%16;
			if(r<=10){
				res=r+res;
			}else{
				res=(char)(r+55)+res;
			
			}
			n=n/16;
		}
		System.out.println(res); 	//7D
	}
}