public class Triangle {
    public static void main(String[] args) {

        int rows = 6;

        for (int i = 1; i <= rows; i++) {

            int num = i % 2;   // odd row → 1, even row → 0

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = 1 - num;   // alternate between 0 and 1
            }

            System.out.println();
        }
    }
}