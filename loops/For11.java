class For11{   // print A1a to Z1z
	public static void main(String[] args){
		int i=1;
		
		for(char ch1='A',ch2='a'; ch1<='Z'&&ch2<='z'; ch1++,ch2++){
		System.out.println(ch1 +""+i+""+ch2);
		
		}
	}
}