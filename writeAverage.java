import java.util.Scanner;

public class writeAverage {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Write first Input");
       int a = sc.nextInt();
       System.out.println("Write Second Input");
       int b = sc.nextInt();
       System.out.println("Write third Input Here!");
       int c = sc.nextInt();
       int average = a+b+c/3;
       System.out.println(average);
    }
}
