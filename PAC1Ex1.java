import java.util.Scanner;

public class PAC1Ex1 {


    public static long nextCollatz(long n) {
        if (n % 2 == 0) {
            return n / 2;
        }

        return 3 * n + 1;
    }

    public static void printCollatzSequence(long n) {
        System.out.print("Seqüència de Collatz: ");

        do {
            System.out.print(n + " -> ");
            n = nextCollatz(n);
        } while (n > 1);
        System.out.print(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n;

        System.out.print("Introduïu un enter positiu: ");
        n = scanner.nextLong();
        printCollatzSequence(n);
    }
}
