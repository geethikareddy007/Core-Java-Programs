class FabnacciSeries2{
	public static void main(String[] args){
		int a=0,b=1,c=a+b, n=100;
			System.out.println(a);
			System.out.println(b);
			while(c<=n){
				c=a+b;
				a=b;
				b=c;
				System.out.println(c);	//o/p came
			}
	}
}
/*18)WAP TO PRINT FIBINOCII SERIES BY READING THE VALUE ?*/