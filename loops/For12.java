class For12{   // print A1a to Z26z
	public static void main(String[] args){
		int i=1;
		
		for(char ch1='A',ch2='z'; i<=26; ch1++,ch2--,i++){
		System.out.println(ch1 +""+i+ch2);
		
		}
	}
}