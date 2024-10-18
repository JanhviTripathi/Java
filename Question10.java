class Question10{
	public static void main(String [] args){
		m10("Janhvi" , "Tripathi");	
	}
	public static void m10(String Fname, String Lname){
		if (Fname.length()>Lname.length()){
			int res = Fname.length()*Fname.length();
			System.out.println(res);
		}
		else{
			int res1 = Lname.length()*Lname.length()*Lname.length();
			System.out.println(res1);
		} 
	}
}