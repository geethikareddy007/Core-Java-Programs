class MethodOverLoading{
	public static void run(char ch, int a){
		System.out.println(char ch, int a);
	}
	public static void run(int a, char ch){
		System.out.println(int a, char ch);
	}
	public static void run(long l, float f){
		System.out.println(long l, float f);
	}
	/*public static void run(int i, char c){
		System.out.println(int i, char c);
	*/}
	public static void run(double d1, double d2){
		System.out.println(double d1, double d2);
	}
	public static void main(String[] args){		//o/p not came
		run(10.0,50.0);
		run('a',10);
		run(10l,10.6);
		//run('a','b');
		//run(true,1);
	}
}
		