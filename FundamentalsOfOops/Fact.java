import java.util.Scanner;
class Fact{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=scan.nextInt();
		int fact=1;
		while(n>0){
			fact=fact*n;
			n--;
		}
		System.out.println(fact);	//o/p came
	}
}