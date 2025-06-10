import java.util.Scanner;

public class convertKiloToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int KiloMeter = sc.nextInt();
        double Mile = KiloMeter * 0.621371;
         System.out.println(Mile);
    }
    
}
