public class Recursion1 {
    // printNumbers
    // public static void printNumbers(int n) {
    // if (n == 6) {
    // return;
    // }
    // System.out.println(n);
    // printNumbers(n + 1);
    // }

    // factriol

    public static int Calculatefactriol(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int factriol = Calculatefactriol(n - 1);
        int fact = n * factriol;
        return fact;

    }

    public static void main(String[] args) {
        // int n = 1;
        // printNumbers(n);
        int n = 4;
        int result = Calculatefactriol(n);
        System.out.println("factorial of given number " + result);
    }

}
