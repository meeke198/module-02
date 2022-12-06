import java.util.Scanner;

public class greatestCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number a: ");
        a = number.nextInt();
        System.out.println("Enter number b: ");
        b = number.nextInt();
//        Math.abs(number) return absolute value of number
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b){
            if(a > b){
                a = a - b;
            }else {
               b = b - a;
            }
        };
        System.out.println("Greatest common factor: " + a);
    }
}
