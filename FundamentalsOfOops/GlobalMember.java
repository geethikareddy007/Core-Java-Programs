class GlobalMember{ 
		static byte b;
		static int i;
		static short s;
		static long l;
		static float f;
		static double d;
		static char ch;
		static boolean b1;
		static String s1;
	public static void main(String[] args){
		System.out.println(b);	//0
		System.out.println(s);	//0
		System.out.println(i);	//0
		System.out.println(l);	//0
		System.out.println(f);	//0.0
		System.out.println(d);	//0.0
		System.out.println(ch);	//
		System.out.println(b1);	//false
		System.out.println(s1);	//null
	}
}