class Star20{   
	public static void main(String[] args){
		int star=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();	//o/p came
			if(i<3)
				star++;
			else
				star--;
		}
	}
}

//*
//**
//***
//**
//*