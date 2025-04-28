class PerfectSqRange{
	public static boolean square(int n){
		boolean flag=false;
		for(int i=2; i<=n/2&&i<=n; i++){
			if(i*i ==n){
				flag = true;
				break;
			}
		}
		if(flag)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		int m=1,n=100;
		for(int i=m;i<=n;i++){
			if(square(i))
				System.out.print(i+" ,");	//o/p came
		}
	}
}
/*o/p:- 4 ,9 ,16 ,25 ,36 ,49 ,64 ,81 ,100 */

/*21)WAP TO PRINT PERFECT SQUARES BETWEEN M AND N ?*/