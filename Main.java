import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int zeros = 0;
        int tot = n * m;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (sc.nextInt() == 0) {
                    zeros++;
                }
                if (zeros > tot / 2) { // Early exit optimization
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
