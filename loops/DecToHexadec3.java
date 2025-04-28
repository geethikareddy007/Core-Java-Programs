class DecToHexadec3{   
	public static void main(String[] args){
		int n=1024;
		String res="";
		while(n!=0){
			int r=n%16;
			switch(r){
				case 10:
					res='A'+res;
				break;
				case 11:
					res='B'+res;
				break;
				case 12:
					res='C'+res;
				break;
				case 13:
					res='D'+res;
				break;
				case 14:
					res='E'+res;
				break;
				case 15:
					res='F'+res;
				break;
				default:
					res=r+res;
				}
				n=n/16;
			}
			System.out.println(res); 	//400
		}
	}
	
		