public class PlaceTiles {
    public static int plactTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        // horizontally
        int horPlacement = plactTiles(n - 1, m);

        // vertically
        int verPlacement = plactTiles(n - m, m);
        return verPlacement + horPlacement;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(plactTiles(n, m) + " ways");

    }
}
