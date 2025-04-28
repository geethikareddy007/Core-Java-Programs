class SpecialCharacter{
	public static void main(String[] args){
	char ch = '@';
	if ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&& ch<='9')){
	System.out.println(ch+" is doesn't contains SpecialCharacter");
	}else{
	System.out.println(ch+" is contains a SpecialCharacter");
	}
	
	}
}