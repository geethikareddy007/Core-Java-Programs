class FabnacciSeries{
	public static void main(String[] args){
		int a=0,b=1, c=a+b;
		System.out.println(a);
		System.out.println(b);
			while(c<=100){
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);	//o/p came
		}
	}
}
			

/*17)WAP TO PRINT FIBINOCII SERIES ?*/