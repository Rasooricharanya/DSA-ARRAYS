import java.util.*;

public class lowTria{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
        }
        }
        int lowTri=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                lowTri+=a[i][j];
            }
        }
            System.out.println(lowTri);

    }
}
