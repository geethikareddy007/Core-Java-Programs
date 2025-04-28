public class Decrement{
	public static void main(String[] args){
		int a=6, b=8, c=12;
		a=--a + b-- + ++c;
		b=b++ + a-- - --c;
		c=++c + --a + --b -c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
}

}