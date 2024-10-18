import java.util.Scanner;

class Student1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll No");
        int rollno  = sc.nextInt();

        System.out.println("Enter First Name");
        String fname = sc.next();

        System.out.println("Enter Last Name");
        String lname =  sc.next();

        // Consuming the leftover newline character before taking the address input
       

        System.out.println("Enter Address");
        String address = sc.nextLine();

        System.out.println("Enter Percentage");
        float p = sc.nextFloat();

        System.out.println("Enter Passing Year");
        int yop = sc.nextInt();

        System.out.println("Are you passout (true/false)");
        boolean pass = sc.nextBoolean();

        // Displaying the inputs
        System.out.println("Roll No: " + rollno);
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Address: " + address);
        System.out.println("Percentage: " + p);
        System.out.println("Year of Passing: " + yop);
        System.out.println("Passout: " + pass);
    }
}
