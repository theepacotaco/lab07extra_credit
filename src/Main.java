public class Main {
    public static void main(String[] args) {
        int height = 7; // Height of the 'T'

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (i == 1 || j == height / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
