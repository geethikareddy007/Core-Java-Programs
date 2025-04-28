class RecursionNumbers{
	public static void main(String[] args){
		print(1,10);
	}
	public static void print(int a, int b){
		if(a<=b){
			System.out.println(a);
			print(a+1,b);
			}
		}
	}
	
/*o/p:-
1
2
3
4
5
6
7
8
9
10
*/