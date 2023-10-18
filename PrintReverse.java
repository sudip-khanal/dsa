
//print in reverse order
public class PrintReverse {
    public static void PrintReverse_Order(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));

            return;
        }
        System.out.print(str.charAt(idx));
        PrintReverse_Order(str, idx - 1);

    }

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        PrintReverse_Order(str, str.length() - 1);

    }
}
