import java.util.Scanner;

public class interestCaculator {
    public static void main(String[] args) {
        double loan;
        int month;
        float interestRate;
        double interest = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the amount of money: ");
        loan = input.nextDouble();
                System.out.println("Input the month: ");
        month = input.nextInt();
        System.out.println("Input the interest rate: ");
        interestRate = input.nextFloat();
        for(int i = 1; i <= month; i++){
            interest = loan * (interestRate/ 100.0)/12.0;
            loan += interest;
        }

        System.out.println("Total interest is: " + Math.ceil(loan));
    }
}
