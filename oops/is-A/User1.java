class User1{
	public static void main(String[] args){
		Y obj=new Y();
		System.out.println(obj.c); //ns-Y
		System.out.println(obj.d); //s-Y
		System.out.println(obj.a);	//ss-X
		obj.test();	//s-A ->CTE
		obj.add();	//ns-X
		System.out.println(obj.toString());	//ns-obj class
	}
}
/*
30
40
10
From X class Static method
From X class
Y@2f92e0f4
*/