class numwithrev{   
	public static void main(String[] args){
	int space=4,star=-1;
	for(int i=1;i<=7;i++){
		if(i<=4){
			space--;
			star+=2;
		}else{
			space++;
			star-=2;
		}
	for(int j=1;j<=space;j++){
		System.out.print(" ");
	}
	for(int j=1;j<=star;j++){
		if((i<j) && (i+j)<8){
			System.out.print(n++);
		}else{
			System.out.print(n--);
		}
	}
	System.out.println();
	}
	