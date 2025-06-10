import java.util.Scanner;

public class power {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Write your Input Here!");
            double base = sc.nextInt();
            System.out.println("Write Input 2 Here!");
            double  exponent = sc.nextInt();
            double result = Math.pow(base, exponent);
            System.out.println(result);
    }
    
}
