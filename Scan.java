import java.util.Scanner;

 class Scan {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int valueInt = scanner.nextInt();

        
        System.out.print("Enter a floating number: ");
        float valueFlo = scanner.nextFloat();

        
        System.out.print("Enter a double: ");
        double valueDou = scanner.nextDouble();

        
        System.out.print("Enter a long: ");
        long valueLon = scanner.nextLong();

        
        System.out.print("Enter a boolean (true/false): ");
        boolean valueBool = scanner.nextBoolean();

       
        System.out.print("Enter a character: ");
        char valueCh = scanner.next().charAt(0);

        
        
        
        System.out.print("Enter a string: ");
        String valStr = scanner.nextLine();

        System.out.println("enter the values");
        System.out.println("Integer: " + valueInt);
        System.out.println("Float: " + valueFlo);
        System.out.println("Double: " + valueDou );
        System.out.println("Long: " + valueLon);
        System.out.println("Boolean: " + valueBool);
        System.out.println("Character: " + valueCh);
        System.out.println("String: " + valStr);

        
    }
}