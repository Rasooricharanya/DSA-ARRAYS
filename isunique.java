import java.util.*;

public class isunique {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            boolean isUnique = true;
            for(int j=0;j<N;j++){
                if(a[i]==a[j]&&i!=j){
                    isUnique = false;
                    break;
            }
            }
            if(isUnique){
                System.out.print(a[i] + " ");
            }

            
        }
    }
}