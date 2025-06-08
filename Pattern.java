public class TwistedPattern {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if (k % 2 == 0)
                    System.out.print((char)(k + 64) + " "); // ASCII A, B, ...
                else
                    System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
