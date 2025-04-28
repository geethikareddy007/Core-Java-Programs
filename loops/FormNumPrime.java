class FormNumPrime{   
	public static void main(String[] args){
		int n =458236;
		int res=0,p=1;
		while(n!=0){
			int r = n%10;
			int c=0;
			if(r==2||r==3||r==5||r==7){
				res=r*p+res;
				p=p*10;
			}
			n=n/10;
			}
			System.out.println(res);  //523
			}
		}
	
			