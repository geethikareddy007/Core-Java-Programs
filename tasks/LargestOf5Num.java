class LargestOf5Num{   
	public static void main(String[] args){
		int a=3,b=7,c=25,d=19,e=23;
		if((a>b&&a>c&&a>d&&a>e)){
			System.out.println(a+" is largest");
		}else{
			if((b>c&&b>d&&b>e)){
				System.out.println(b+" is largest");
			}else{
				if((c>d&&c>e)){
					System.out.println(c+" is largest");	//25 is largest
				}else{
					if((d>e)){
						System.out.println(d+" is largest");
					}else{
						System.out.println(e+" is largest");
					}
				}
			}
		}
	}
}
	
	
/*9)WAP TO PRINT LARGEST OF 5 NUMBERS ?*/