class Student {

	String sname;
	int roll_no;
	long contact_no;
	String gender;
	public static void main(String [] args)
	{
		Student s1=new Student();
		s1.sname="Jyoti";
		s1.roll_no=78;
		s1.contact_no=8498384024l;
		System.out.println(s1.sname);
		System.out.println(s1.roll_no);
		System.out.println(s1.gender);
	
		Student s2=new Student();
		s2.sname="Rohan";
		s2.contact_no=39593894434l;

		s2.roll_no=45;
		System.out.println(s1.contact_no);
		
		System.out.println(s2.sname);
		System.out.println(s2.roll_no);
		System.out.println(s2.contact_no);
		System.out.println(s2.gender);
		
		s1.gender="Female";
	}

}