import java.util.Scanner;

public class First20Prime {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input starting number: ");
        int number = input.nextInt();
        for (int i = number;; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            if (count == 20) break;
        }
    }
    static boolean isPrime(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }
}
