import java.util.Scanner;

public class Ex01DisplayGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter greeting: ");
        String greeting = sc.nextLine();
        String result = "Hello " + greeting;
        System.out.println(result);

        String myName = "Ti";
        System.out.printf("My name's %s", myName);
        sc.close();
    }
}
