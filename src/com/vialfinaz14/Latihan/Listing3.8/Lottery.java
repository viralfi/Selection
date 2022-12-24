import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        int lotteryDigits1 = lottery / 10;
        int lotteryDigits2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);
        if (guess == lottery)
        System.out.print("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigits1 && guessDigit1 == lotteryDigits2)
        System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigits1 || guessDigit1 == lotteryDigits2 || guessDigit2 == lotteryDigits1 || guessDigit2 == lotteryDigits2)

        System.out.println("Match one digits: you win $1,000");
        else
        System.out.println("sorry, no match");
    }
}