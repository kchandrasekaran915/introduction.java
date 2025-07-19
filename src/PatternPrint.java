public class PatternPrint {
    public static void main(String[] args) {
        int n = 5; // given number

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j > n - i + 1) {
                    System.out.print(j);
                } else {
                    System.out.print(n - i + 1);
                }
            }
            System.out.println();
        }
    }
}

