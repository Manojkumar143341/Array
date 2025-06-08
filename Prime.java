import java.util.Scanner;

public class TwistedPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n == 3) {
            System.out.println("3 is banned!");
        } else if (isPrime(n)) {
            int rev = reverse(n);
            if (rev != 3 && isPrime(rev)) {
                System.out.println(n + " is a twisted prime.");
            } else {
                System.out.println(n + " is prime but not twisted.");
            }
        } else {
            System.out.println(n + " is not a prime.");
        }
    }

    static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= x / 2; i++)
            if (x % i == 0) return false;
        return true;
    }

    static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }
}
