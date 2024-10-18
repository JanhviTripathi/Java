import java.util.Scanner;

class Gamong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt(); 
        int num3 = sc.nextInt();;

        System.out.println((num1 > num2) ? ((num1 > num3) ? num1+" Is Greater" : num3+ " Is Greater") : ((num2 > num3) ? num2+ " Is Greater" : num3 +" Is Greater"));

        
    }
}
