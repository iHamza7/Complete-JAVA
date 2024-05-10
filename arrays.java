public class arrays {
    public static void main(String[] args) {
        int[][] num = new int[3][4];
        int[] num1 = new int[5];
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
        num1[3] = 4;

        // for (int i = 1; i < num1.length; i++) {
        // System.out.println(i);
        // }
        for (int n : num1) {
            System.out.println(n);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 10);

            }
        }

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print(num[i][j] + " ");
        // }
        // System.out.println();
        // }

        for (int n[] : num) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
