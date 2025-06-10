import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Length");
        int l = sc.nextInt();
        System.out.println("Write Width!");
        int w = sc.nextInt();
        int per = 2 * (l*w);
        System.out.println(per);

    }
}   
