class SmallestOf4{   
	public static void main(String[] args){
		int a=10, b=5, c=15, d=3;
		int res=((a<b&&a<c&&a<d)?a:(b<c&&c<d)?b:(c<d)?c:d);
		System.out.println(res+" is smallest"); 	//3
	}
}


/*2)WAP TO PRINT SMALLEST OF 4 NUMBERS ? */