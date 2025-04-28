class AllValues{
	public static void main(String[] args){
	char ch='@';
	if ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&& ch<='9'))
		if ((ch>='A'&&ch<='Z')||(ch>='a'&&ch>='z')){
		System.out.println(ch+" is a Alphabet");
	} else {
		System.out.println(ch+" is a Digit");
	} else{
		System.out.println(ch+" is a Special Character");
	}
	
	}
	}	