class AlphabetVowel{
	public static void main(String[] args){
		char ch='$';
		if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			System.out.println(ch+" is a vowel");
			}else{
			System.out.println(ch+" is a consonant");
			}else{
			System.out.println(ch+" is not a alphabet");
			}
		}
	}

			