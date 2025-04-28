class MaxOf3{
	public static void main(String[] args){
		int a,b,c;
		a=2;
		b=4;
		c=6;
		int res=(a>b)&&(a>c)?a:(b>c?b:c);
		System.out.println(res + "is a largest number");
		
}
}