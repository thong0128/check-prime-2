public class PrimeLowerThan100 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (First20Prime.isPrime(i))
                System.out.print(i + ", ");
        }
    }
}
