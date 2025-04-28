class C{
	static int i=10;
	int j=20;
	C obj=new C();
	public static void main(String[] args){
		C obj = new C();
		System.out.println(obj.j);
		System.out.println(obj.obj.j);	//StackOverflowErrorException 
	}
}