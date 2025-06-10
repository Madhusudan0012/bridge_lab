import java.util.Scanner;
public class Volume {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your Height Here!");
        int h = sc.nextInt();
        System.out.println("Write your Radius Here!");
        // int r = sc.nextInt();
        double  r = sc.nextInt();
        double Vol = 3.14 * r*r *h;
        System.out.println(Vol);

    }
    
}
