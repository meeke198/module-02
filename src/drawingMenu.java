import java.util.Scanner;

public class drawingMenu {
    public static void main(String[] args) {
        int choice = -1;
        System.out.println("Menu");
        System.out.println("1. Draw a triangle");
        System.out.println("2. Draw a square");
        System.out.println("3. Draw a rectangle");
        System.out.println("4. Draw a star");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        while(choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 4:
                    System.out.println("This is definitely a starrrr :vv");
                    System.out.println("  *      *  ");
                    System.out.println("   * * *   ");
                    System.out.println("* * * * * *");
                    System.out.println("  * * * *  ");
                    System.out.println("   * * *    ");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
