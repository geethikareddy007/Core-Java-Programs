class RecursionProduct{
	public static void main(String[] args){
		int product=product(1,5);
		System.out.println("product : "+product);	//120
	}
	public static int product(int a,int b){
		if(a==b){
			return b;
		}else{
			return a*product(a+1,b);
		}
	}
}