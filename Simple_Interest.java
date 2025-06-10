import java.util.Scanner;
public class Simple_Interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Input!");
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        double SI = (principal*rate*time)/100;
        System.out.println(SI);


    }
    
}
