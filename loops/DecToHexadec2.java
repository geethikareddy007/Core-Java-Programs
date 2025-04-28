class DecToHexadec2{   
	public static void main(String[] args){
		int n=125;
		String res="";
		while(n!=0){
			int r=n%16;
			if(r<=9){
				res=r+res;
			}else if(r==10){
				res='A'+res;
			}else if(r==11){
				res='B'+res;
			}else if(r==12){
				res='C'+res;
			}else if(r==13){
				res='D'+res;
			}else if(r==14){
				res='E'+res;
			}else if(r==15){
				res='F'+res;
			
			}
			n=n/16;
		}
		System.out.println(res); //7D
	}
			
}

			