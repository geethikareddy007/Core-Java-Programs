class Fizzbuzz{
	public static void main(String[] args){
		int m=1,n=100;
		for(int i=m;i<=n;i++){
			if(i%3==0 && i%5==0){
				System.out.print("fizzbuzz"+" ");
			}else if(i%3==0){
				System.out.print("fizz"+" ");
			}else if(i%5==0){
				System.out.print("buzz"+" ");
			}else{
			System.out.print(i+",");
			}
		}
	}
}