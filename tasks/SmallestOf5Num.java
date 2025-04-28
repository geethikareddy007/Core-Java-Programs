class SmallestOf5Num{   
	public static void main(String[] args){
	int a=13,b=7,c=25,d=19,e=23;
		if((a<b&&a<c&&a<d&&a<e)){
			System.out.println(a+" is Smallest");
		}else{
			if((b<c&&b<d&&b<e)){
				System.out.println(b+" is Smallest");	//7 is Smallest
			}else{
				if((c<d&&c<e)){
					System.out.println(c+" is Smallest");	
				}else{
					if((d<e)){
						System.out.println(d+" is Smallest");
					}else{
						System.out.println(e+" is Smallest");
					}
				}
			}
		}
	}
}
	
	
/*10)WAP TO PRINT SMALLEST OF 5 NUMBERS ?*/