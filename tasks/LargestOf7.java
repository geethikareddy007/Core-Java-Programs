class LargestOf7{   
	public static void main(String[] args){
	int a=10, b=5, c=5, d=3, e=25, f=2, g=9;
	int res=((a>b && a>c && a>d && a>e && a>f && a>g)?a:
			(b>c && b>d && b>e && b>f && b>g)?b:
			(c>d && c>e && c>f && c>g)?c:
			(d>e && d>f && d>g)?d:
			(e>f && e>g)?e:
			(f>g)?f:g);
			System.out.println(res+" is largest");		//25
	}
}






/*4)WAP TO PRINT LARGEST OF 7 NUMBERS ? */