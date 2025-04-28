public class Typecast{
	public static void main(String[]args){
		int a=10;
		double d=a;
		System.out.println(d); //10.0
		double d1=65.99;
		char ch=(char)d1;
		System.out.println(ch); //A
		float f1=3.7f;
		long l1=(long)f1;
		System.out.println(l1); //3

		byte b=20;
		short s=(short)b;
		System.out.println(s);
		
		short x=30;
		byte y=(byte)x;
		System.out.println(y);
		
		short a3=65;
		char b3=(char)a3;
		System.out.println(b3);

		char p=20;
		short s_h=(short)p;
		System.out.println(s_h);

		
		char c_h=3;
		int i=(int)c_h;
		System.out.println(c_h);

		int i_n=20;
		char c_r=(char)i_n;
		System.out.println(c_r);

		

		
}






}