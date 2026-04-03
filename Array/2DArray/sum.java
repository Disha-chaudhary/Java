// package ArrayList;
import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
        int[][] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m ;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int Wholesum = 0;
    //  int rowSum = 0;
        // int colSum = 0;

        for(int i = 0; i<n ; i++){
            for(int j = 0 ; j<m; j++){
                Wholesum+=arr[i][j];
            }
        }
        for(int i = 0; i<n ; i++){
            int rowSum = 0;
            for(int j = 0 ; j<m; j++){
                rowSum+=arr[i][j];
            }
            System.out.println("the sum of row "+i+" is "+rowSum);
        }
        for(int j = 0; j<m ; j++){
            int colSum = 0;
            for(int i = 0 ; i<n; i++){
                colSum+=arr[i][j];
            }
            System.out.println("the sum of col "+j+" is "+colSum);
        }
        
        System.out.println("the whole sum of 2d array is"+Wholesum);
        sc.close();
    }

   
}
