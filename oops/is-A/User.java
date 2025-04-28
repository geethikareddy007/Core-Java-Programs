class User{
	public static void main(String[] args){
		B obj=new B();
		System.out.println(obj.c);
		System.out.println(obj.a);
		obj.add();
		System.out.println(obj.toString());
	}
}

/*
30
10
From A class
B@2f92e0f4
*/