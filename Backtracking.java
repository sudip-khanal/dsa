public class Backtracking {
    public static void printPremutation(String str, int idx, String prem) {
        if (str.length() == 0) {
            System.out.println(prem);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            printPremutation(newstr, idx + 1, prem + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPremutation(str, 0, "");
    }

}
