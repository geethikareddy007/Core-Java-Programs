class MiddleNumber{   
	public static void main(String[] args){
	int a=210,b=90,c=150;
		if(a>b&&a>c){
			if(b>c){
				System.out.println(b);
			}else{
				System.out.println(c);
			}
		}else if (b>c&&b>a){
			if(a>c){
				System.out.println(a);
			}else{
				System.out.println(c);
			}
		}else if (c>a&&c>b){
			if(b>a){
				System.out.println(b);
			}else{
				System.out.println(a);	//o/p came
			}
		}
	}
}



/*11)WAP TO PRINT MIDDLE NUMBER FROM 3 NUMBERS ?*/
