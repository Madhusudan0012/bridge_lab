import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args){
        System.out.println("Write your Input!");
        
        Scanner sc = new Scanner(System.in);

        double r = sc.nextInt();
        double area = 3.14 * r*r;
        System.out.println(area);



    }
    
}
